/*******************************************************************************
 * Copyright (c) 2008 The University of York.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Louis Rose - initial API and implementation
 ******************************************************************************/
package org.eclipse.epsilon.egl.merge.partition;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.epsilon.egl.merge.output.Output;
import org.eclipse.epsilon.egl.merge.output.ProtectedRegion;
import org.eclipse.epsilon.egl.merge.output.Region;
import org.eclipse.epsilon.egl.util.FileUtil;


public class CommentBlockPartitioner implements Partitioner {

	private final String startComment;
	private final String endComment;
	
	private String firstLine;
	private String contents = "(.*^[\\s]*)";
	private String lastLine;
	
	private static String escape(String text) {
		String escaped;
		
		escaped = text.replaceAll("\\*", "\\\\*");
		
		return escaped;
	}
	
	public CommentBlockPartitioner(String startComment, String endComment) {
		this.startComment = startComment == null ? "" : startComment;
		this.endComment   = endComment   == null ? "" : endComment;
		init();
	}
	
	private void init() {
		initFirstLine();
		initLastLine();
	}
	
	private void initFirstLine() {
		final StringBuilder regex = new StringBuilder();
		
		if (startComment.length() > 0) {
			// The start comment delimiter
			regex.append(escape(startComment));
			
			// whitespace
			regex.append("[\\s]*");
		}
		
		// The protected region literal
		regex.append("protected region ");
		
		// The region's id, matched reluctantly and terminated with a space
		regex.append("(.*?) ");
		
		// on or off followed by begin
		regex.append("(on|off) begin");
	
		if (endComment.length() > 0) {
			// whitespace
			regex.append("[\\s]*");
	
			// The end comment delimiter
			regex.append(escape(endComment));
		}
		
		// Any amount of whitespace, up to the end of the line
		regex.append("[\\s]*^");
		
		firstLine = regex.toString();
	}
	
	private void initLastLine() {
		final StringBuilder regex = new StringBuilder();
		
		if (startComment.length() > 0) {
			// The start comment delimiter
			regex.append(escape(startComment));
			
			// whitespace
			regex.append("[\\s]*");
		}
		
		// The protected region literal
		regex.append("protected region ");
		
		// The region's id terminated with a space
		regex.append("\\1 ");
		
		// end
		regex.append("end");
		
		if (endComment.length() > 0) {
			// whitespace
			regex.append("[\\s]*");
	
			// The end comment delimiter
			regex.append(escape(endComment));
		}
		
		lastLine = regex.toString();
	}
	
	public String getStartComment() {
		return startComment;
	}
	
	public String getEndComment() {
		return endComment;
	}
	
	public String getFirstLine(String id, boolean enabled) {
		final StringBuilder builder = new StringBuilder();
		
		// Build starting comment
		if (startComment.length() > 0) {
			builder.append(startComment);
			builder.append(' ');
		}
		builder.append("protected region ");
		builder.append(id);
		builder.append(" ");
		builder.append(enabled ? "on" : "off");
		builder.append(" begin");
		if (endComment.length() > 0) {
			builder.append(' ');
			builder.append(endComment);
		}
		
		return builder.toString();
	}

	public String getLastLine(String id) {
		final StringBuilder builder = new StringBuilder();
		
		// Build ending comment
		if (startComment.length() > 0) {
			builder.append(startComment);
			builder.append(' ');
		}
		builder.append("protected region ");
		builder.append(id);
		builder.append(" end");
		if (endComment.length() > 0) {
			builder.append(' ');
			builder.append(endComment);
		}
		
		return builder.toString();
	}
	
	public Output partition(String text) {
		return partition(text, 0);
	}
	
	public Output partition(String text, int offset) {
		final List<Region> regions = new LinkedList<Region>();
		
		final Pattern pattern = Pattern.compile(firstLine + contents + lastLine, Pattern.MULTILINE | Pattern.DOTALL);
		final Matcher matcher = pattern.matcher(text);
	
		int previousEnd = 0;
		
		while (matcher.find()) {
			if (matcher.start() > previousEnd) {
				regions.add(new Region(text.substring(previousEnd, matcher.start())));
			}
			previousEnd = matcher.end();
			
			boolean enabled = matcher.group(2) != null && matcher.group(2).equals("on");
			
			final ProtectedRegion region = new CommentedProtectedRegion(matcher.group(1), matcher.start() + offset, enabled, matcher.group(3));
	
			regions.add(region);
		}
		
		if (previousEnd < text.length())
			regions.add(new Region(text.substring(previousEnd)));
		
		return new Output(regions);
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + 
		       "{start=\"" + startComment + "\", " + 
		       "end=\"" + endComment + "\"}";
	}
	
	@Override
	public boolean equals(Object o) {
		if (o == null) return false;
		if (!(o instanceof CommentBlockPartitioner)) return false;
		
		final CommentBlockPartitioner that = (CommentBlockPartitioner)o;
		
		return startComment.equals(that.startComment) &&
		       endComment.equals(that.endComment);
	}
	
	@Override
	public int hashCode() {
		int result = 17;
		
		result += 37 * (startComment.hashCode());
		result += 37 * (endComment.hashCode());
		
		return result;
	}
	
	
	class CommentedProtectedRegion extends ProtectedRegion {
		
		CommentedProtectedRegion(String id, int offset, boolean enabled, String contents) {
			super(id, offset, enabled, contents);
		}

		@Override
		public String toString() {
			final StringBuilder builder = new StringBuilder();
			
			builder.append(getFirstLine(getId(), isEnabled()));
			
			builder.append(FileUtil.NEWLINE);
			
			if (isEnabled())
				builder.append(getContents());
			
			else
				builder.append(getDefaultValue());
			
			builder.append(getLastLine(getId()));
			
			return builder.toString();
		}
		
	}
}

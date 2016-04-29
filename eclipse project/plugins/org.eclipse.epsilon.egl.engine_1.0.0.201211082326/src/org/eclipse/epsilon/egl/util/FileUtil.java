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
package org.eclipse.epsilon.egl.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public abstract class FileUtil {

	// Uninstantiable class
	private FileUtil() {}

	public final static String FILE_SEP = System.getProperty("file.separator");
	public final static String NEWLINE  = System.getProperty("line.separator");
	public final static String ESCAPED_NEWLINE  = NEWLINE.replaceAll("\r", "\\\\r").replaceAll("\n", "\\\\n");
	
	/**
	 * Returns the absolute path for the given path. The given path may 
	 * be relative, in which case it is resolved using 
	 * <code>parent</code> as its parent path. If <code>parent</code> is 
	 * <code>null</code>, the path is resolved using the default relative 
	 * path (typically the directory from which the JVM was launched).
	 * 
	 * @param path   a relative or absolute path.
	 * @param parent the parent directory to use when resolving a 
	 *               relative path.
	 * 
	 * @return The absolute path for the given path.
	 * 
	 * @throws NullPointerException when <code>path</code> is 
	 *                              <code>null</code>
	 */
	public static String resolve(String path, File parent) {
		if (path==null)
			throw new NullPointerException("path may not be null");
		
		File file = new File(path);
		
		if (!file.isAbsolute() && parent != null) {
			file = new File(parent, path);
		}
		
		return file.getAbsolutePath();
	}
	
	/**
	 * @return null if the file doesn't exist
	 */
	public static String readIfExists(File file) throws IOException {
		return file.exists() ? read(file) : null;
	}
	
	public static String read(File file) throws IOException {
		BufferedReader reader = null;
		
		try {
			final StringBuilder contents = new StringBuilder();
			
			reader = new BufferedReader(new FileReader(file));
			
			int c;

			while((c = reader.read()) != -1) {
				if ((char)c == '\r' && (char)reader.read() == '\n')
					contents.append(NEWLINE);
				
				else if ((char)c == '\n')
					contents.append(NEWLINE);
				
				else
					contents.append((char)c);
			}
		
			return contents.toString();
			
		} finally {
			if (reader!=null) reader.close();
		}
	}
	
	public static void write(String path, String contents) throws IOException {
		write(new File(path), contents);
	}
	
	public static void write(String path, String contents, boolean append) throws IOException {
		write(new File(path), contents, append);
	}
	
	public static void write(File file, String contents) throws IOException {
		write(file, contents, false);
	}
	
	public static void write(File file, String contents, boolean append) throws IOException {	
		if (!file.getParentFile().exists()) {
			file.getParentFile().mkdirs();
		}
		
		FileWriter writer = null;
		
		try {
			if (!file.exists()) file.createNewFile();
			
			writer = new FileWriter(file, append);
			
			writer.write(contents);
			writer.flush();
		
		} finally {
			if (writer!=null) writer.close();
		}
	}
}

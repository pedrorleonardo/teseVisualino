/*******************************************************************************
 * Copyright (c) 2008 The University of York.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Dimitrios Kolovos - initial API and implementation
 ******************************************************************************/
package org.eclipse.epsilon.profiling.dt;

import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;

public abstract class SortableTableColumn extends TableColumn {
	
	protected int direction = SWT.DOWN;
	protected TableViewer tableViewer;
	
	public SortableTableColumn(TableViewer tableViewer, int style) {
		super(tableViewer.getTable(), style);
		this.tableViewer = tableViewer;
		init();
	}

	@Override
	protected void checkSubclass() {
		
	}

	public SortableTableColumn(TableViewer tableViewer, int style, int index) {
		super(tableViewer.getTable(), style, index);
		this.tableViewer = tableViewer;
		init();
	}
	
	private void init() {
		
		this.addSelectionListener(new SelectionListener() {

			public void widgetDefaultSelected(SelectionEvent e) {
				
			}

			public void widgetSelected(SelectionEvent e) {
				SortableTableColumn col = (SortableTableColumn) e.widget;
				Table table = col.getParent();
				if (table.getSortColumn() == col) {
					if (direction == SWT.DOWN) direction = SWT.UP;
					else direction = SWT.DOWN;
				}
				else {
					table.setSortColumn(col);
				}
				table.setSortDirection(direction);
				tableViewer.setSorter(new SortableTableColumnSorter(col));
			}
			
			
		});
		
	}
	
	abstract int compare(Object o1, Object o2);
	
	private class SortableTableColumnSorter extends ViewerSorter {
		
		protected SortableTableColumn column;
		protected TableItem[] tableItems;
		protected int columnIndex;
		
		public SortableTableColumnSorter(SortableTableColumn column) {
			this.column = column;
			tableItems = column.getParent().getItems();
			int i = 0;
			for (TableColumn c : column.getParent().getColumns()) {
				if (c == column) {
					columnIndex = i;
					break;
				}
				else i++;
			}
		}

		@Override
		public int compare(Viewer viewer, Object e1, Object e2) {
			ITableLabelProvider labelProvider = (ITableLabelProvider) tableViewer.getLabelProvider();
			int result = SortableTableColumn.this.compare(labelProvider.getColumnText(e1, columnIndex), labelProvider.getColumnText(e2, columnIndex));
			if (direction == SWT.DOWN) result = -1 * result;
			return result;
		}
		
	}
	
}	

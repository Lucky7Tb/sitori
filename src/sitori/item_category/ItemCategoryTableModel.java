/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sitori.item_category;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author gema
 */
public class ItemCategoryTableModel extends AbstractTableModel {
    private final List<ItemCategory> categoryList;
    
    private final String[] columnNames = new String[] {
        "ID", "Kategori Barang"
    };
    
    private final Class[] columnClass = new Class[] {
        Integer.class, String.class
    };
    
    public ItemCategoryTableModel(List<ItemCategory> itemList) {
        this.categoryList = itemList;
    }
    
    @Override
    public String getColumnName(int column)
    {
        return columnNames[column];
    }
 
    @Override
    public Class<?> getColumnClass(int columnIndex)
    {
        return columnClass[columnIndex];
    }

    @Override
    public int getRowCount() {
        return this.categoryList.size();
    }

    @Override
    public int getColumnCount() {
        return this.columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ItemCategory row = categoryList.get(rowIndex);
        
        switch(columnIndex) {
            case 0:
                return row.getId();
            case 1:
                return row.getItemCategoryName();
            default:
                return null;
        }
    }
}

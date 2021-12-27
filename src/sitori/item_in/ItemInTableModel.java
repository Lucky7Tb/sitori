/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sitori.item_in;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * @author lucky
 * @author gema
 */
public class ItemInTableModel extends AbstractTableModel{
    private final List<ItemIn> itemInList;
     
    private final String[] columnNames = new String[] {
        "Nama barang", "Jumlah barang", "Deskripsi", "Tgl barang masuk"
    };
    
    private final Class[] columnClass = new Class[] {
        Integer.class, String.class, Integer.class, String.class, String.class
    };
    
    public ItemInTableModel(List<ItemIn> itemInList) {
        this.itemInList = itemInList;
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
        return this.itemInList.size();
    }

    @Override
    public int getColumnCount() {
        return this.columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ItemIn row = itemInList.get(rowIndex);
        
        switch(columnIndex) {
            case 0:
                return row.getItemName();
            case 1:
                return row.getItemInAmmount();
            case 2:
                return row.getDescription();
            case 3:
                return row.getCreatedAt();
            default:
                return null;
        }
    }
}

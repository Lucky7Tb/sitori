package sitori.item;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author lucky
 */
public class ItemTableModel extends AbstractTableModel{
    private final List<Item> itemList;
     
    private final String[] columnNames = new String[] {
        "Id", "Nama barang", "Kategori", "Tempat penyimpanan", "Stok barang", "Tgl perubahan"
    };
    
    private final Class[] columnClass = new Class[] {
        Integer.class, String.class, String.class, String.class, String.class, Integer.class, String.class
    };
    
    public ItemTableModel(List<Item> itemList) {
        this.itemList = itemList;
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
        return this.itemList.size();
    }

    @Override
    public int getColumnCount() {
        return this.columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Item row = itemList.get(rowIndex);
        
        switch(columnIndex) {
            case 0:
                return row.getId();
            case 1:
                return row.getItemName();
            case 2:
                return row.getItemCategoryName();
            case 3:
                return row.getItemStorageName();
            case 4:
                return row.getItemGoodConditionAmmount();
            case 5:
                return row.getUpdatedAt();
            default:
                return null;
        }
    }
    
}

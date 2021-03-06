package sitori.item_out;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author lucky
 */
public class ItemOutTableModel extends AbstractTableModel{
    private final List<ItemOut> itemOutList;
     
    private final String[] columnNames = new String[] {
        "Nama barang", "Jumlah barang", "Deskripsi", "Tgl barang keluar"
    };
    
    private final Class[] columnClass = new Class[] {
        String.class, Integer.class, Integer.class, String.class, String.class
    };
    
    public ItemOutTableModel(List<ItemOut> itemOutList) {
        this.itemOutList = itemOutList;
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
        return this.itemOutList.size();
    }

    @Override
    public int getColumnCount() {
        return this.columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ItemOut row = itemOutList.get(rowIndex);
        
        switch(columnIndex) {
            case 0:
                return row.getItemName();
            case 1:
                return row.getItemOutAmmount();
            case 2:
                return row.getDescription();
            case 3:
                return row.getCreatedAt();
            default:
                return null;
        }
    }
    
}

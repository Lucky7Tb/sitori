package sitori.storage;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author lucky
 * @author audy
 */
public class StorageTableModel extends AbstractTableModel{
    private final List<Storage> storageList;
     
    private final String[] columnNames = new String[] {
        "Tempat Penyimpanan", "Tgl Perubahan"
    };
    
    private final Class[] columnClass = new Class[] {
        String.class, String.class
    };
    
    public StorageTableModel(List<Storage> storageList) {
        this.storageList = storageList;
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
        return this.storageList.size();
    }

    @Override
    public int getColumnCount() {
        return this.columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Storage row = storageList.get(rowIndex);
        
        switch(columnIndex) {
            case 0:
                return row.getStorageName();
            case 1:
                return row.getUpdatedAt();
            default:
                return null;
        }
    }
    
}

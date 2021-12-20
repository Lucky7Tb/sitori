package sitori.last_activity;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author lucky
 */
public class LastActivityTableModel extends AbstractTableModel{
    private final List<LastActivity> listLastActivity;
     
    private final String[] columnNames = new String[] {
        "Nama barang", "Jumlah barang", "Status", "Deskripsi", "Tanggal"
    };
    
    private final Class[] columnClass = new Class[] {
        String.class, Integer.class, String.class, String.class, String.class
    };
    
    public LastActivityTableModel(List<LastActivity> listLastActivity) {
        this.listLastActivity = listLastActivity;
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
        return this.listLastActivity.size();
    }

    @Override
    public int getColumnCount() {
        return this.columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        LastActivity row = listLastActivity.get(rowIndex);
        
        switch(columnIndex) {
            case 0:
                return row.getItemName();
            case 1:
                return row.getAmmount();
            case 2:
                return row.getStatus();
            case 3:
                return row.getDescription();
            case 4:
                return row.getCreatedAt();
            default:
                return null;
        }
    }
    
}

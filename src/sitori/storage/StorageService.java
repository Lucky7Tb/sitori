package sitori.storage;

import java.sql.SQLException;
import java.util.ArrayList;
import sitori.base.Service;
import sitori.db.DbService;
        
/**
 *
 * @author lucky
 * @author audy
 */
import java.sql.ResultSet;
import javax.swing.JOptionPane;
public class StorageService extends Service<Storage> {

    @Override
    public ArrayList<Storage> getAll() {
        try {
            ArrayList<Storage> listStorage = new ArrayList<Storage>();
            String sql = "SELECT * FROM `storage`";
            ResultSet result = DbService.get(sql);
            
            while(result.next()) {
                listStorage.add(
                    new Storage(
                            result.getInt("id"),
                            result.getString("storage_name")
                    )
                );
            }
            
            return listStorage;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(
                null, 
                "Internal error",
                "Error",
                JOptionPane.ERROR_MESSAGE
            );
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                null, 
                "Internal error",
                "Error",
                JOptionPane.ERROR_MESSAGE
            );
        } finally {
            DbService.closeConnection();
        }
        
       return null;
    }

    @Override
    public Storage getOne(int id) {
        try {
            String query = "SELECT * FROM `storage`";
            query = String.format(query, id);
            ResultSet result = DbService.get(query);
            while(result.next()) {
                return new Storage(
                    result.getInt("id"),
                    result.getString("storage_name")
                );
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(
                null, 
                "Db error",
                "Error",
                JOptionPane.ERROR_MESSAGE
            );
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                null, 
                "Internal error",
                "Error",
                JOptionPane.ERROR_MESSAGE
            );
        } finally {
            DbService.closeConnection();
        }
        
        return null;
    }

    @Override
    public void insert(Storage storage) {
        try {
            String query = "INSERT INTO `storage` (`storage_name`)"
                    + "VALUES ('%s')";
            query = String.format(
                query,
                storage.getStorageName()
            );
            boolean isError = DbService.query(query);
            if (!isError) {
                JOptionPane.showMessageDialog(
                    null, 
                    "Sukses tambah barang",
                    "Sukses",
                    JOptionPane.INFORMATION_MESSAGE
                );
            } else {
                JOptionPane.showMessageDialog(
                    null, 
                    "Db error",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                );
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                null, 
                "Internal error",
                "Error",
                JOptionPane.ERROR_MESSAGE
            );
        } finally {
            DbService.closeConnection();
        }
    }

    @Override
    public void update(int id, Storage storage) {
        try {
            String query = "UPDATE `storage` SET `storage_name` = '%s' WHERE `id` = %d";
            query = String.format(query, storage.getStorageName(), id);
            boolean isError = DbService.query(query);
            
            if (!isError) {
                JOptionPane.showMessageDialog(
                    null, 
                    "Sukses update barang",
                    "Sukses",
                    JOptionPane.INFORMATION_MESSAGE
                );
            } else {
                JOptionPane.showMessageDialog(
                    null, 
                    "Db error",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                );
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                null, 
                "Internal Error",
                "Error",
                JOptionPane.ERROR_MESSAGE
            );
        } finally {
            DbService.closeConnection();
        }
    }

    @Override
    public void delete(int id) {
        try {
          String query = "DELETE FROM  `storage` WHERE `id` = %d";
            query = String.format(query, id);
            boolean isError = DbService.query(query);
            if (!isError) {
                JOptionPane.showMessageDialog(
                    null, 
                    "Sukses hapus barang",
                    "Sukses",
                    JOptionPane.INFORMATION_MESSAGE
                );
            } else {
               JOptionPane.showMessageDialog(
                null, 
                "Db error",
                "Error",
                JOptionPane.ERROR_MESSAGE
               );
            }   
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                null, 
                "Internal Error",
                "Error",
                JOptionPane.ERROR_MESSAGE
            );
        } finally {
            DbService.closeConnection();
        }
    }
    
}

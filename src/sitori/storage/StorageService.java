package sitori.storage;

import java.sql.SQLException;
import java.util.ArrayList;
import sitori.base.Service;
import sitori.db.DbService;
        
/**
 *
 * @author lucky
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insert(Storage object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(int id, Storage object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

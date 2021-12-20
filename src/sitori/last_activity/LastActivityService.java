package sitori.last_activity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import sitori.base.Service;
import sitori.db.DbService;
/**
 *
 * @author lucky
 */
public class LastActivityService {

    public ArrayList<LastActivity> getAll(String dateFrom, String dateTo, String status) {
        try {
            String whereQuery;
            switch(status) {
                case "SEMUA":
                    whereQuery = "WHERE `last_activity`.`status` IN ('BARANG_MASUK', 'BARANG_KELUAR')";
                    break;
                case "BARANG_MASUK":
                    whereQuery = "WHERE `last_activity`.`status` = 'BARANG_MASUK' ";
                    break;
                case "BARANG_KELUAR":
                    whereQuery = "WHERE `last_activity`.`status` = 'BARANG_KELUAR' ";
                    break;
                default:
                    whereQuery = "";
                    break;
            }
            
            if (!dateFrom.equals("") && !dateTo.equals("")) {
                whereQuery += "AND `last_activity`.`created_at` BETWEEN '%s' AND '%s'";
                whereQuery = String.format(
                    whereQuery,
                    (dateFrom + " 00:00:00"),
                    (dateTo + " 23:59:59")
                );
            }
            
            ArrayList<LastActivity> listLastActivity = new ArrayList<>();
            String query = "SELECT `item`.`item_name`, last_activity.* FROM `last_activity`"
                    + " JOIN `item` ON `item`.`id` = `last_activity`.`item_id` ";
            query += whereQuery;
            ResultSet result =  DbService.get(query);
            
            while(result.next()) {
                listLastActivity.add(
                    new LastActivity(
                        result.getInt("id"),
                        result.getInt("item_id"),
                        result.getString("item_name"),
                        result.getInt("ammount"),
                        result.getString("description"),
                        result.getString("status"),
                        result.getString("created_at"),
                        result.getString("updated_at")                    
                    )
                );
            }
            
            return listLastActivity;
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

}

package sitori.item_out;

import sitori.item.Item;
import sitori.db.DbService;
import sitori.item.ItemService;
import sitori.base.Service;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author lucky
 */
public class ItemOutService extends Service<ItemOut> {
    @Override
    public ArrayList<ItemOut> getAll() {
        try {
            ArrayList<ItemOut> listItemOut = new ArrayList<>();
        
            ResultSet result = DbService.get(
                "SELECT item_out.*, `item`.`item_name`"
                + "FROM `item_out`"
                + "JOIN `item` ON `item`.`id` = `item_out`.`item_id`"
            );
            while(result.next()) {
                listItemOut.add(new ItemOut(
                    result.getInt("id"),
                    result.getInt("item_id"),
                    result.getString("item_name"),
                    result.getInt("item_out_ammount"),
                    result.getString("description"),
                    result.getString("created_at"),
                    result.getString("updated_at")
                ));
            }
            
            return listItemOut;
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
    public ItemOut getOne(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insert(ItemOut itemOut) {
        try {
            ItemService itemService = new ItemService();
            Item item = itemService.getOne(itemOut.getItemId());
            
            if (item.getItemGoodConditionAmmount() < itemOut.getItemOutAmmount()) {
                JOptionPane.showMessageDialog(
                    null, 
                    "Stok barang kurang",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                );
            } else {
                String query = "INSERT INTO "
                    + "`item_out` (`item_id`, `item_out_ammount`, `description`) "
                    + "VALUES ('%d', '%d', '%s')";
                query = String.format(
                    query, 
                    itemOut.getItemId(),
                    itemOut.getItemOutAmmount(), 
                    itemOut.getDescription()
                );
                boolean isError = DbService.query(query);
                if (!isError) {
                    query = "INSERT INTO "
                            + "`last_activity` (`item_id`, `ammount`, `description`, `status`)"
                            + "VALUE ('%d', '%d', '%s', 'BARANG_KELUAR')";
                    query = String.format(
                        query, 
                        itemOut.getItemId(), 
                        itemOut.getItemOutAmmount(),
                        itemOut.getDescription()
                    );
                    isError = DbService.query(query);
                    if (isError) {
                        JOptionPane.showMessageDialog(
                            null, 
                            "Db error",
                            "Error",
                            JOptionPane.ERROR_MESSAGE
                        );
                        return;
                    } else {
                        query = "UPDATE `item` SET item_good_condition_ammount = item_good_condition_ammount - %d WHERE id = %d";
                        query = String.format(
                            query, 
                            itemOut.getItemOutAmmount(), 
                            itemOut.getItemId()
                        );
                        isError = DbService.query(query);
                        if (isError) {
                            JOptionPane.showMessageDialog(
                                null, 
                                "Db error",
                                "Error",
                                JOptionPane.ERROR_MESSAGE
                            );
                            return;
                        } else {
                            JOptionPane.showMessageDialog(
                                null, 
                                "Sukses menambah barang keluar",
                                "Sukses",
                                JOptionPane.INFORMATION_MESSAGE
                            );
                        }
                    }
                }
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
    public void update(int id, ItemOut itemOut) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

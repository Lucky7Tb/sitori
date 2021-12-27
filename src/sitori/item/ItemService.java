package sitori.item;

import sitori.db.DbService;
import sitori.base.Service;
import sitori.helper.DateHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author lucky
 */
public class ItemService extends Service<Item> {
    
    @Override
    public ArrayList<Item> getAll() {
        try {
            ArrayList<Item> listItem = new ArrayList<>();
        
            ResultSet result = DbService.get(
                "SELECT item.*, `storage`.`storage_name`, `item_category`.`item_category_name` FROM `item`"
                + " JOIN `storage` ON `storage`.`id` = `item`.`item_storage_id`"
                + " JOIN `item_category` ON `item_category`.`id` = `item`.`item_category_id`"
            );
            while(result.next()) {
                listItem.add(new Item(
                    result.getInt("id"),
                    result.getString("item_name"),
                    result.getInt("item_category_id"),
                    result.getString("item_category_name"),
                    result.getInt("item_storage_id"),
                    result.getString("storage_name"),
                    result.getInt("item_good_condition_ammount"),
                    result.getString("created_at"),
                    result.getString("updated_at")
                ));
            }
            
            return listItem;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            DbService.closeConnection();
        }
                
        return null;
    }

    @Override
    public Item getOne(int id) {
        try {
            String query =  "SELECT item.*, `storage`.`storage_name`, `item_category`.`item_category_name` FROM `item`"
                + " JOIN `storage` ON `storage`.`id` = `item`.`item_storage_id`"
                + " JOIN `item_category` ON `item_category`.`id` = `item`.`item_category_id`"
                + "WHERE `item`.`id` = %d";
            query = String.format(query, id);
            ResultSet result = DbService.get(query);
            while(result.next()) {
                return new Item(
                    result.getInt("id"),
                    result.getString("item_name"),
                    result.getInt("item_category_id"),
                    result.getString("item_category_name"),
                    result.getInt("item_storage_id"),
                    result.getString("storage_name"),
                    result.getInt("item_good_condition_ammount"),
                    result.getString("created_at"),
                    result.getString("updated_at")
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
    public void insert(Item item) {
        try {
            String query = "INSERT INTO `item` (`item_name`, `item_category_id`, `item_storage_id`, `item_good_condition_ammount`)"
                    + "VALUES ('%s', '%d', '%d', '%d')";
            query = String.format(
                query,
                item.getItemName(),
                item.getItemCategoryId(),
                item.getItemStorageId(),
                item.getItemGoodConditionAmmount()
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
    public void update(int id, Item item) {
        try {
            String query = "UPDATE `item` SET `item_name` = '%s', `item_category_id` = %d, `item_storage_id` = %d, `updated_at` = '%s' WHERE `id` = %d";
            query = String.format(query, item.getItemName(), item.getItemCategoryId(), item.getItemStorageId(), DateHelper.generateTimeStamp(), id);
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
          String query = "DELETE FROM  `item` WHERE `id` = %d";
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

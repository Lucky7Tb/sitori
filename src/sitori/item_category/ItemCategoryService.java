package sitori.item_category;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import sitori.base.Service;
import sitori.db.DbService;
import javax.swing.JOptionPane;
import sitori.helper.DateHelper;

/**
 *
 * @author lucky
 * @author gema
 */
public class ItemCategoryService extends Service<ItemCategory> {

    @Override
    public ArrayList<ItemCategory> getAll() {
        try {
            ArrayList<ItemCategory> listItemCategory = new ArrayList<ItemCategory>();
            String sql = "SELECT * FROM `item_category`";
            ResultSet result = DbService.get(sql);
            
            while(result.next()) {
                listItemCategory.add(
                    new ItemCategory(
                        result.getInt("id"),
                        result.getString("item_category_name"),
                        result.getString("updated_at")
                    )
                );
            }
            
            return listItemCategory;
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
    public ItemCategory getOne(int id) {
        try {
            String query =  "SELECT * FROM `item_category`";
            query = String.format(query, id);
            ResultSet result = DbService.get(query);
            while(result.next()) {
                return new ItemCategory(
                    result.getInt("id"),
                    result.getString("item_category_name"),
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
    public void insert(ItemCategory category) {
        try {
            String query = "INSERT INTO `item_category` (`item_category_name`)"
                    + "VALUES ('%s')";
            query = String.format(
                query,
                category.getItemCategoryName()
            );
            boolean isError = DbService.query(query);
            if (!isError) {
                JOptionPane.showMessageDialog(
                    null, 
                    "Sukses tambah kategori",
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
    public void update(int id, ItemCategory category) {
        try {
        String query = "UPDATE `item_category` SET `item_category_name` = '%s', `updated_at` = '%s' WHERE `id` = %d";
            query = String.format(query, category.getItemCategoryName(), DateHelper.generateTimeStamp(), id);
            boolean isError = DbService.query(query);
            
            if (!isError) {
                JOptionPane.showMessageDialog(
                    null, 
                    "Sukses update kategori",
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
          String query = "DELETE FROM  `item_category` WHERE `id` = %d";
            query = String.format(query, id);
            boolean isError = DbService.query(query);
            if (!isError) {
                JOptionPane.showMessageDialog(
                    null, 
                    "Sukses hapus Kategori",
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

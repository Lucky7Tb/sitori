package sitori.item_category;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import sitori.base.Service;
import sitori.db.DbService;

/**
 *
 * @author lucky
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
                        result.getString("item_category_name")
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insert(ItemCategory object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(int id, ItemCategory object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

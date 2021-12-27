/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sitori.item_in;

import sitori.item.Item;
import sitori.db.DbService;
import sitori.item.ItemService;
import sitori.base.Service;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 * @author lucky
 * @author gema
 */
public class ItemInService extends Service<ItemIn> {
    @Override
    public ArrayList<ItemIn> getAll() {
        try {
            ArrayList<ItemIn> listItemIn = new ArrayList<>();
        
            ResultSet result = DbService.get(
                "SELECT item_in.*, `item`.`item_name`"
                + "FROM `item_in`"
                + "JOIN `item` ON `item`.`id` = `item_in`.`item_id`"
            );
            while(result.next()) {
                listItemIn.add(new ItemIn(
                    result.getInt("id"),
                    result.getInt("item_id"),
                    result.getString("item_name"),
                    result.getInt("item_in_ammount"),
                    result.getString("description"),
                    result.getString("created_at"),
                    result.getString("updated_at")
                ));
            }
            
            return listItemIn;
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
    public ItemIn getOne(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void insert(ItemIn itemIn) {
        try {
            ItemService itemService = new ItemService();
            Item item = itemService.getOne(itemIn.getItemId());
            
             
                String query = "INSERT INTO "
                    + "`item_in` (`item_id`, `item_in_ammount`, `description`) "
                    + "VALUES ('%d', '%d', '%s')";
                query = String.format(
                    query, 
                    itemIn.getItemId(),
                    itemIn.getItemInAmmount(), 
                    itemIn.getDescription()
                );
                boolean isError = DbService.query(query);
                if (!isError) {
                    query = "INSERT INTO "
                            + "`last_activity` (`item_id`, `ammount`, `description`, `status`)"
                            + "VALUE ('%d', '%d', '%s', 'BARANG_MASUK')";
                    query = String.format(
                        query, 
                        itemIn.getItemId(), 
                        itemIn.getItemInAmmount(),
                        itemIn.getDescription()
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
                        query = "UPDATE `item` SET item_good_condition_ammount = item_good_condition_ammount + %d WHERE id = %d";
                        query = String.format(
                            query, 
                            itemIn.getItemInAmmount(), 
                            itemIn.getItemId()
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
                                "Sukses menambah barang masuk",
                                "Sukses",
                                JOptionPane.INFORMATION_MESSAGE
                            );
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
    public void update(int id, ItemIn itemIn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

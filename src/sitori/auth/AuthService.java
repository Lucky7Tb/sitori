package sitori.auth;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import sitori.db.DbService;
import sitori.helper.PasswordHelper;
/**
 *
 * @author lucky
 */
public class AuthService {
    public boolean login(String username, String password) {
        try {
            String query = "SELECT `username`, `password` FROM `admin` WHERE `username` = '%s'";
            query = String.format(query, username);
            ResultSet result = DbService.get(query);

            if (result.next()) {
                String adminPassword = result.getString("password");
                String hashPassword = PasswordHelper.hashPassword(password);
                
                return adminPassword.equals(hashPassword);
            } else {
                return false;
            }   
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Internal error", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        return false;
    }
    
}

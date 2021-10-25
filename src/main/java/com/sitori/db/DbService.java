package com.sitori.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author lucky
 */
public class DbService {
    private static Connection connection;
    private static Statement statement; 
    
    
    public static ResultSet get(String query) {
        try {
            openConnection();

            ResultSet resultSet = statement.executeQuery(query);
                    
            return resultSet;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return null;
    }
    
    public static boolean query(String query) {
        try {
            openConnection();
            
            return statement.execute(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return false;
    }
    
    public static void openConnection() {
        try {
            Class.forName(DbConfig.getDriver());
            connection = DriverManager.getConnection(
                DbConfig.getDbUrl(), 
                DbConfig.getDbUser(), 
                DbConfig.getDbPassword()
            );
            statement = connection.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }
   
    public static void closeConnection() {
        try {
            connection.close();
            statement.close();   
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

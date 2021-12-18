package sitori.db;

import io.github.cdimascio.dotenv.Dotenv;

/**
 *
 * @author lucky
 */
public class DbConfig {
    private static final Dotenv env = Dotenv.load();
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://"+ env.get("DB_HOST") +"/" + env.get("DB_NAME");
    private static final String DB_USER = env.get("DB_USER");
    private static final String DB_PASSWORD = env.get("DB_PASSWORD");
    
   public static String getDriver() {
       return DbConfig.DRIVER;
   }
   
   public static String getDbUrl() {
       return DbConfig.DB_URL;
   }
   
    public static String getDbUser() {
       return DbConfig.DB_USER;
   }
    
     public static String getDbPassword() {
       return DbConfig.DB_PASSWORD;
   }
}

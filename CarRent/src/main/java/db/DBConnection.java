/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
 /*
 * @author ASUS
 */
public class DBConnection {
   private static DBConnection dbconnection;
private Connection connection;

private DBConnection(){
    
       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/carrent","root","1234");
       } catch (ClassNotFoundException | SQLException ex) {
           Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
       }
    
}
public static DBConnection getInstance(){
    if(dbconnection==null){
        dbconnection = new DBConnection();
    }
    return dbconnection;
}
public Connection getConnection(){
    return connection;
} 
}

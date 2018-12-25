/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


/**
 *
 * @author KABILASHAN
 */
public class db {
    Connection conn=null;
   
   public static Connection java_db(){
       try{
           
           
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample", "root", "");
            //JOptionPane.showMessageDialog(null,"Connected");
            return conn;
            
       }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
       }
   }
}

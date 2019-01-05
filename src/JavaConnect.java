/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anikesh
 */

import java.sql.*;
import javax.swing.JOptionPane;

public class JavaConnect {
   static Connection con;
    
    public static Connection connerDb(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management_system?autoReconnect=true&useSSL=false","root","geekyshows");
            System.out.println("Connection Established");
            return con;
        }
        catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
        
    }
    
   //
    public static void main(String args[]){
        connerDb();
    }

}

import java.sql.*;
public class MySqlConnection {
    public static void main(String [] args){
        Connection con=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management_system?autoReconnect=true&useSSL=false","root","geekyshows");
            System.out.println("Connection Established");
        }
        catch(ClassNotFoundException e){
            System.out.println("Exception :-"+e.getMessage());
        }
        catch(SQLException e){
            System.out.println("SQLException:-"+e.getMessage());
        }
        try{
            con.close();
        }catch(SQLException e){
            
        }
    }
}

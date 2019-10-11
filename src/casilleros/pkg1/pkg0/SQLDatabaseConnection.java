package casilleros.pkg1.pkg0;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class SQLDatabaseConnection {
    
    private String driver = "com.mysql.jdbc.Driver";
    private String strConection = "jdbc:mysql://127.0.0.1/casilleros";
    private String user = "root";
    private String pass = "mysql";
    
    public SQLDatabaseConnection() throws ClassNotFoundException{
        
        try  {
            Class.forName(driver);
            Connection conector = DriverManager.getConnection(strConection,user,pass);
            JOptionPane.showMessageDialog(null,"Se ha conectado a la base de datos "+strConection);
        }
        
        catch (SQLException e) {
           JOptionPane.showMessageDialog(null,"Algo no anda bien :/ \n"+e.getMessage());
        }
    }
    
    public void executeQuery() throws SQLException{
        try{
            String query = "SELECT * FROM users;";
            Connection conector = DriverManager.getConnection(strConection,user,pass);
            Statement stmt = conector.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()) System.out.println(rs.getString(0)+
                    " "+ rs.getString(1) + 
                    " "+ rs.getString(2)+ 
                    " "+ rs.getString(3)+ 
                    " "+ rs.getString(4)+ 
                    " "+ rs.getString(5)+ 
                    " "+ rs.getString(6)+ 
                    " "+ rs.getString(7));
            
            rs.close();
            stmt.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Algo no anda bien :/ \n"+e.getMessage());
        }
        
    }
}

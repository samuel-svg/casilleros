package casilleros.pkg1.pkg0;

import java.sql.SQLException;

public class Casilleros10 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        MainMenu mainMenu = new MainMenu();
        mainMenu.setVisible(true);
        
        SQLDatabaseConnection sqlCn = new SQLDatabaseConnection();
        sqlCn.executeQuery();
    }
    
}

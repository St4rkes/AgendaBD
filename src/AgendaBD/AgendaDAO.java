package AgendaBD;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;

public class AgendaDAO {

    public static void main(String[] args) throws Exception {
        String dbURL = "jdbc:postgresql://localhost:5432/ead";
        String username = "postgres";
        String password = "147";

        Connection conn = DriverManager.getConnection(dbURL, username, password);

        if (conn != null) {
            System.out.println("Conectado ao BD com sucesso!");
        }
    }

    
   
    
}

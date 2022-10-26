package AgendaBD;

import java.sql.*;

public class ConexaoBD {
    public static void main(String[] args) throws Exception {
        String dbURL = "jdbc:postgresql://localhost:5432/ead";
        String username = "postgres";
        String password = "aluno";

        Connection conn = DriverManager.getConnection(dbURL, username, password);

        if (conn != null) {
            System.out.println("Conectado ao BD com sucesso!");
        }
    }
}

package AgendaBD;

import java.sql.*;

public class CriarTabelasBD {
    private static int executeUpdate;

    public static void main(String[] args) throws Exception {
        String dbURL = "jdbc:postgresql://localhost:5432/ead";
        String username = "postgres";
        String password = "aluno";

        Connection conn = DriverManager.getConnection(dbURL, username, password);

        String sql = "CREATE TABLE agenda (" +
                     "id int primary key," +   
                     "nome varchar," + 
                     "dataNascimento varchar," + 
                     "contato varchar)";

        PreparedStatement statement = conn.prepareStatement(sql);
        executeUpdate = statement.executeUpdate();
    }
}

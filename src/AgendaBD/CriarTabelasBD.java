package AgendaBD;

import java.sql.*;

public class CriarTabelasBD {
    public static void main(String[] args) throws Exception {
        String dbURL = "jdbc:postgresql://localhost:5432/ead";
        String username = "postgres";
        String password = "aluno";

        Connection conn = DriverManager.getConnection(dbURL, username, password);

        String sql = "CREATE TABLE agenda (" +
                     "id int primary key," +   
                     "nome varchar(40)," + 
                     "dataNascimento varchar(40)," + 
                     "contato varchar(40)";

        PreparedStatement statement = conn.prepareStatement(sql);
        statement.executeUpdate();
    }
}

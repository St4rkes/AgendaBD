import java.sql.*;

public class CriarTabelasBD {
    public static void main(String[] args) throws Exception {
        String dbURL = "jdbc:postgresql://localhost:5432/ead";
        String username = "postgres";
        String password = "147";

        Connection conn = DriverManager.getConnection(dbURL, username, password);

        String sql = "CREATE TABLE agenda (" +
                     "nome varchar," + 
                     "dataNascimento varchar(40)," + 
                     "contato varchar)";

        PreparedStatement statement = conn.prepareStatement(sql);
        statement.executeUpdate();
    }
}

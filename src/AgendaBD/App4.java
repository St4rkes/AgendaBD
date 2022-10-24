package AgendaBD;

import java.sql.*;
import java.util.ArrayList;

public class App4 {
    public static void main(String[] args) throws Exception {
        ArrayList<Pessoa> pessoa = new ArrayList<>();
        String dbURL = "jdbc:postgresql://localhost:5432/ead";
        String username = "postgres";
        String password = "147";
        Connection conn = DriverManager.getConnection(dbURL, username, password);

        String sql = "SELECT * FROM agenda";

        PreparedStatement statement = conn.prepareStatement(sql);

        ResultSet registros = statement.executeQuery();

        while (registros.next()) {
            String nome = registros.getString("nome");
            String dataNascimento = registros.getString("dataNascimento");
            String contato = registros.getString("contato");
            Pessoa p1 = new Pessoa(nome, dataNascimento, contato);
            Pessoa.add(p1);
        }
        
        System.out.println(pessoa);
    }
}

package ArryList;
import java.sql.*;

import AgendaBD.Pessoa;

public class App5 {
    public static void main(String[] args) throws Exception {

        String dbURL = "jdbc:mysql://localhost:3306/ead";
        String username = "root";
        String password = "root";
        Connection conn = DriverManager.getConnection(dbURL, username, password);

        String sql = "SELECT * FROM item WHERE idItem = ?";

        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setInt(1, 2);
        ResultSet registros = statement.executeQuery();

        Pessoa item;
        if (registros.next()) {
            int id = registros.getInt("idItem");
            String nome = registros.getString("nome");
            double preco = registros.getDouble("preco");
            item = new Pessoa(id, nome, preco);
            System.out.println(item);
        }
        else {
            item = null;
            System.out.println("Item não encontrado!");
            System.out.println(item);
        }
        

    }
}

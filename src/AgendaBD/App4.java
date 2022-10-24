import java.sql.*;
import java.util.ArrayList;

public class App4 {
    public static void main(String[] args) throws Exception {
        ArrayList<Item> itens = new ArrayList<>();
        String dbURL = "jdbc:mysql://localhost:3306/ead";
        String username = "root";
        String password = "root";
        Connection conn = DriverManager.getConnection(dbURL, username, password);

        String sql = "SELECT * FROM item";

        PreparedStatement statement = conn.prepareStatement(sql);

        ResultSet registros = statement.executeQuery();

        while (registros.next()) {
            int id = registros.getInt("idItem");
            String nome = registros.getString("nome");
            double preco = registros.getDouble("preco");
            Item item = new Item(id, nome, preco);
            itens.add(item);
        }
        
        System.out.println(itens);
    }
}

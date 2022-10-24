import java.sql.*;

public class App7 {
    public static void main(String[] args) throws Exception {
        String dbURL = "jdbc:mysql://localhost:3306/ead";
        String username = "root";
        String password = "root";
        Connection conn = DriverManager.getConnection(dbURL, username, password);


        String sql = "SELECT * FROM item WHERE idItem = ?";

        PreparedStatement statement = conn.prepareStatement(sql);
        
        statement.setInt(1, 2);

        ResultSet registros = statement.executeQuery();

        Item item;
        if (registros.next()) {
            int id = registros.getInt("idItem");
            String nome = registros.getString("nome");
            double preco = registros.getDouble("preco");
            item = new Item(id, nome, preco);
            System.out.println(item);
        }
        else {
            item = null;
            System.out.println("Item não encontrado!");
            System.out.println(item);
        }

        sql = "DELETE FROM item WHERE idItem = ?";
        statement = conn.prepareStatement(sql);

        statement.setDouble(1, item.idItem);

        int rowsInserted = statement.executeUpdate();

        if (rowsInserted > 0) {
            System.out.println("Item removido com sucesso!");
        }

    }
}
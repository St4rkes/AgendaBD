import java.sql.*;

public class App3 {
    public static void main(String[] args) throws Exception {
        String dbURL = "jdbc:mysql://localhost:3306/ead";
        String username = "root";
        String password = "root";
        Connection conn = DriverManager.getConnection(dbURL, username, password);


        Item item = new Item(3, "SSD", 299.89);


        String sql = "INSERT INTO Item (idItem, nome, preco) VALUES (?, ?, ?)";
        PreparedStatement statement = conn.prepareStatement(sql);

        statement.setInt(1, item.idItem);
        statement.setString(2, item.nome);
        statement.setDouble(3, item.preco);

        int rowsInserted = statement.executeUpdate();

        if (rowsInserted > 0) {
            System.out.println("Item cadastrado com sucesso!");
        }

    }
}

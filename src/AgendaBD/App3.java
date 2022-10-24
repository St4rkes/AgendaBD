package AgendaBD;

import java.sql.*;

public class App3 {
    public static void main(String[] args) throws Exception {
        String dbURL = "jdbc:postgresql://localhost:5432/ead";
        String username = "postgres";
        String password = "147";
        Connection conn = DriverManager.getConnection(dbURL, username, password);


        Pessoa pessoa = new Pessoa("Moisés", "SSD", "62981146557");


        String sql = "INSERT INTO agenda (nome, dataNascimento, contato) VALUES (?, ?, ?)";
        PreparedStatement statement = conn.prepareStatement(sql);

        statement.setString(1, pessoa.nome);
        statement.setString(2, pessoa.dataNascimento);
        statement.setString(3, pessoa.contato);

        int rowsInserted = statement.executeUpdate();

        if (rowsInserted > 0) {
            System.out.println("Item cadastrado com sucesso!");
        }

    }
}

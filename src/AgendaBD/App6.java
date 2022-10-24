package AgendaBD;

import java.sql.*;

public class App6 {
   
    public static void main(String[] args) throws Exception {
        String dbURL = "jdbc:postgresql://localhost:5432/ead";
        String username = "postgres";
        String password = "147";
        Connection conn = DriverManager.getConnection(dbURL, username, password);


        String sql = "SELECT * FROM agenda WHERE nome = ?";

        PreparedStatement statement = conn.prepareStatement(sql);
        
        statement.setString(1, "Moisés");

        ResultSet registros = statement.executeQuery();

        Pessoa pessoa;
        if (registros.next()) {
            String nome = registros.getString("nome");
            String dataNascimento = registros.getString("dataNascimento");
            String contato = registros.getString("contato");
            Pessoa p1 = new Pessoa(nome, dataNascimento, contato);
            System.out.println(p1);
        }
        else {
            pessoa = null;
            System.out.println("Item não encontrado!");
            System.out.println(pessoa);
        }

        //Alterando o preco do objeto Item
         Pessoa.nome = "Joao";

        sql = "UPDATE agenda set nome = ? WHERE nome = ?";
        statement = conn.prepareStatement(sql);

        statement.setString(1, Pessoa.nome);
        statement.setString(2, Pessoa.dataNascimento);

        int rowsInserted = statement.executeUpdate();

        if (rowsInserted > 0) {
            System.out.println("Nome Alterado com sucesso!");
        }

    }
}
package AgendaBD;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;

public class AgendaDAO {
    
        //conn é declarado como atributo da classe para ser acessível
        private Connection conn;
       
    
        //Construtor inicia a conexão com o BD.
            public AgendaDAO() throws Exception {
            String dbURL = "jdbc:postgresql://localhost:5432/ead";
            String username = "postgres";
            String password = "aluno";
            conn = DriverManager.getConnection(dbURL, username, password);
        }
        //CRUD:
        //Creat - Inserir dados no BD
        public void inserir(Pessoa pessoa) throws Exception{
    
            String sql = "INSERT INTO agenda (nome, dataNascimento, contato, id) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);

            statement.setInt(1, pessoa.getId());
            statement.setString(2, pessoa.getNome());
            statement.setString(3, pessoa.getDataNascimento());
            statement.setString(4, pessoa.getContato());
    
            statement.executeUpdate();
    
    
        }
    
        //Read: Objter os objetos a partir dos dados do BD;
        
        public ArrayList<Pessoa> Listar() throws Exception{
            ArrayList<Pessoa> pessoa = new ArrayList<>();
    
            String sql = "SELECT * FROM agenda";
    
            PreparedStatement statement = conn.prepareStatement(sql);
    
            ResultSet registros = statement.executeQuery();
    
            while (registros.next()) {
                int id = registros.getInt("id");
                String nome = registros.getString("nome");
                String dataNascimento = registros.getString("dataNascimento");
                String contato = registros.getString("contato");
                Pessoa p1 = new Pessoa(id, nome, dataNascimento, contato);
                pessoa.add(p1);
            }
            
            System.out.println(pessoa);
            return pessoa;
    
        }
    
        public Pessoa obterPessoa(int id) throws Exception {
    
            String sql = "SELECT * FROM agenda WHERE id = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, id);
    
            ResultSet registros = statement.executeQuery();
    
            Pessoa pessoa;
            if (registros.next()) {
                int idPessoa = registros.getInt("id");
                String nome = registros.getString("nome");
                String dataNascimento = registros.getString("dataNascimento");
                String contato = registros.getString("contato");
                Pessoa p1 = new Pessoa(idPessoa, nome, dataNascimento, contato);
                return p1;
            }
            else {
                pessoa = null;
                System.out.println("Pessoa não encontrado!");
                return pessoa;
            }
           
    
        }
    
        // public void alterar(Item item) throws Exception {
    
        //     String sql = "UPDATE item set preco = ? WHERE idItem = ?";
        //     PreparedStatement statement = conn.prepareStatement(sql);
    
        //     statement.setDouble(1, item.preco);
        //     statement.setDouble(3, item.idItem);
        //     statement.setInt(2, item.idItem);
    
        //     statement.executeUpdate();
    
           
        // }
    
        public void remover(Pessoa pessoa) throws Exception{
            String sql = "DELETE FROM agenda WHERE id = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
    
            statement.setInt(1, pessoa.getId());
        }
        

    
   
    
}




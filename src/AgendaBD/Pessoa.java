package AgendaBD;
public class Pessoa {
    String nome;
    String dataNascimento;
    String contato;
    
    public Pessoa(String nome, String dataNascimento, String contato) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.contato = contato;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", dataNascimento=" + dataNascimento + ", contato=" + contato + "]";
    }
    
    
    
}

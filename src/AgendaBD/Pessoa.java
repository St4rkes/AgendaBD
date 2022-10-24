package AgendaBD;
public class Pessoa {
    static String nome;
    static String dataNascimento;
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


    

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public Object getNome() {
        return null;
    }

    public static void add(Pessoa pessoa) {
    }
    
    
    
}

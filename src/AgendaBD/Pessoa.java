package AgendaBD;
public class Pessoa {
    private String nome;
    private String dataNascimento;
    private String contato;
    private int id;
    
    
    public Pessoa(int id, String nome, String dataNascimento, String contato) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.contato = contato;
    }

    

    

    @Override
    public String toString() {
        return "Pessoa [nome=" + getNome() + ", dataNascimento=" + getDataNascimento() + ", contato=" + getContato() + ", id=" + getId()
                + "]";
    }





    public String getNome() {
        return nome;
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





    public int getId() {
        return id;
    }





    public void setId(int id) {
        this.id = id;
    }


    


    
    
    
}

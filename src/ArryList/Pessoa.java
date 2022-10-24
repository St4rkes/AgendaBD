public class Pessoa {
	private String nome;
	private String dataNascimento;
	private String fone;
	
	public Pessoa(String nome, String dataNascimento, String fone) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.fone = fone;
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
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", dataNascimento=" + dataNascimento + ", fone=" + fone + "]";
	}
	
	
}
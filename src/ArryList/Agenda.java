import java.util.ArrayList;

public class Agenda{
	
	private ArrayList<Pessoa> listaPessoas;
	
	public Agenda() {
		listaPessoas = new ArrayList<Pessoa>();
	}
	
	void armazenaPessoa(String nome, String dataNascimento, String contato) {
		Pessoa nova = new Pessoa(nome, dataNascimento, contato);
		listaPessoas.add(nova);
	}

	void removePessoa(String nome) {
		for (int i = 0; i < listaPessoas.size(); i++) {
			Pessoa p = listaPessoas.get(i);
			if (p.getNome().equals(nome)) {
				listaPessoas.remove(p);
				listaPessoas.remove(i);
		}
	}
}

	// imprime os dados de todas as pessoas da agenda
	void imprimeAgenda() {
		for (Pessoa p : listaPessoas) 
			System.out.println(p);
	}
}
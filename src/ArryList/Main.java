public class Main {

	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		
		agenda.armazenaPessoa("Fulano de Tal", "08/08/1998", "62999998888");
		agenda.armazenaPessoa("Beltrano de Tal", "09/09/1999", "62999997777");
		agenda.armazenaPessoa("Cicrano de Tal", "10/10/2000", "62999996666");
		agenda.armazenaPessoa("Delano de Tal", "11/11/2001", "62999995555");

		agenda.imprimeAgenda();
		
		agenda.removePessoa("Cicrano de Tal");
		System.out.println("------------------------------------------");
		agenda.imprimeAgenda();
	}

}

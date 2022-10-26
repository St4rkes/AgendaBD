package AgendaBD;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)throws Exception {
        try (Scanner teclado = new Scanner(System.in)) {
            //criando um objeto para manipular os objetos no BDA
      AgendaDAO dao = new AgendaDAO();
            
            boolean rodar = true;
            while(rodar) {

                
            System.out.println("\n\nSistema de cadastro de pessoa");
            System.out.println("1--- Mostra lista de pessoas");
            System.out.println("2--- Buscar por pessoa");
            System.out.println("3--- Cadastrar Pessoa");
            System.out.println("4--- Alterar pessoa");
            System.out.println("5--- Remover pessoa da lista");
            System.out.println("6--- Sair");
            System.out.println("Digite a opcao desejada");

            int opcao = teclado.nextInt();

            switch(opcao){
                case 1:
                    ArrayList<Pessoa> listar = dao.Listar();
                    for(Pessoa p: listar){
                        System.out.println(p);
                    }
                  
                break;

                case 2:
                    System.out.println("Digite o ID");
                    int pessoaId = teclado.nextInt();
                    Pessoa p = dao.obterPessoa(pessoaId);
                    System.out.println(p);
                break;

                case 3:
                    System.out.println("CADASTRO DE PESSOA:");
                    System.out.println("Digite o seu id");
                    int id = teclado.nextInt();
                    
                    System.out.println("Digite o seu nome");
                    String nome = teclado.nextLine();
                    

                    System.out.println("Seu telefone");
                    String telefone = teclado.nextLine();

                    System.out.println("Sua Data de nascimento");
                    String data = teclado.nextLine();

                    Pessoa pessoa = new Pessoa(id, nome, telefone, data);
                    dao.inserir(pessoa);
                    break;

                // case 4:
                //     System.out.println("Digite o id da Pessoa desejada realizar a alteracao");
                //     int idPessoa = input.nextInt();
                //     Pessoa pessoaAlterar = dao.getPessoaPorId(idPessoa);
                //     System.out.println(pessoaAlterar);
                //     System.out.println("Novo nome");
                //     pessoaAlterar.nome = input.nextLine();
                //     pessoaAlterar.nome = input.nextLine();
                //     System.out.println("novo telefone");
                //     pessoaAlterar.telefone = input.nextLine();
                //     System.out.println("nova data de nascimento");
                //     pessoaAlterar.data = input.nextLine();
                //     dao.alterar(pessoaAlterar);
                // break;

                case 5:
                 System.out.println("Digite o i da pessoa desejada remover");
                    int delete = teclado.nextInt();
                    dao.remover(dao.obterPessoa(delete));
                break;

                case 6: 
                    System.out.println("Volte sempre !");
                    rodar = false;
                break;

                default:
                System.out.println("Tente novamente !");

            }
     }
        }
	
    }
}
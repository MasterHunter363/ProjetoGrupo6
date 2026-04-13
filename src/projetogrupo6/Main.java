
import java.util.ArrayList;
import java.util.Scanner;
import projetogrupo6.Pessoa;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pessoa> lista = new ArrayList<>();

        int opcao;
        do {
            System.out.println("\n=== SISTEMA DE CADASTRO ===");
            System.out.println("1 - Cadastrar pessoa");
            System.out.println("2 - Listar pessoas");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Idade: ");

                    int idade = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("CPF: ");
                    String cpf = scanner.nextLine();

                    Pessoa p = new Pessoa(nome, idade, cpf);
                    lista.add(p);
                    System.out.println("Pessoa cadastrada!");

                    break;

                case 2:
                    System.out.println("\nLista de pessoas:");
                    if (lista.isEmpty()) {
                        System.out.println("Nenhuma pessoa cadastrada.");
                    } else {
                        for (Pessoa pessoa : lista) {
                            System.out.println("Nome: " + pessoa.getNome() + " - Idade: " + pessoa.getIdade() + " - CPF: " + pessoa.getCpf());
                        }
                        System.out.println("Total: " + lista.size());
                    }

                    break;
                case 0:
                    System.out.println("Encerrando...");

                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
        scanner.close();
    }
}

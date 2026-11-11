
import java.util.Scanner;

public class CadastroFilmes {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String[] nomes = new String[10];

        String[][] informacoes = new String[10][2];

        int quantidade = 0;
        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Cadastrar filme");
            System.out.println("2 - Listar filmes cadastrados");
            System.out.println("3 - Encerrar");
            System.out.print("Escolha uma opcao: ");

            opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {

                case 1:

                    if (quantidade < 10) {

                        System.out.println("\n--- Cadastro de Filme ---");

                        System.out.print("Nome do filme: ");
                        nomes[quantidade] = entrada.nextLine();

                        System.out.print("Genero: ");
                        informacoes[quantidade][0] = entrada.nextLine();

                        System.out.print("Ano de lancamento: ");
                        informacoes[quantidade][1] = entrada.nextLine();

                        quantidade++;

                        System.out.println("Filme cadastrado com sucesso!");

                    } else {
                        System.out.println("Limite de 10 filmes atingido!");
                    }

                    break;

                case 2:

                    System.out.println("\n--- Filmes Cadastrados ---");

                    if (quantidade == 0) {

                        System.out.println("Nenhum filme cadastrado.");

                    } else {

                        for (int i = 0; i < quantidade; i++) {

                            System.out.println("\nFilme " + (i + 1));
                            System.out.println("Nome: " + nomes[i]);
                            System.out.println("Genero: " + informacoes[i][0]);
                            System.out.println("Ano: " + informacoes[i][1]);

                        }
                    }

                    break;

                case 3:

                    System.out.println("Aplicacao encerrada!");

                    break;

                default:

                    System.out.println("Opcao invalida! Tente novamente.");

            }

        } while (opcao != 3);

        entrada.close();
    }
}

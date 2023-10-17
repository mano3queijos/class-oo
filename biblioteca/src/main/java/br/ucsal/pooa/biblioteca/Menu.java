package br.ucsal.pooa.biblioteca;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {


//    RepositorioLivroBancoDeDados repositorioLivro = new RepositorioLivroBancoDeDados();
	RepositorioLivroMemoria repositorioLivro = new RepositorioLivroMemoria();

//    public Menu(RepositorioLivroBancoDeDados repositorioLivro) {
//        this.repositorioLivro = repositorioLivro;
//    }
    
    public Menu(RepositorioLivroMemoria repositorioLivro) {
    	this.repositorioLivro = repositorioLivro;
    }
    
    public  void iniciar() {
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;
        do {
            System.out.println("1. Adicionar Livro");
            System.out.println("2. Remover Livro");
            System.out.println("3. Consultar Livro");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = scanner.nextInt();
                scanner.nextLine();
                if (opcao == 1) {
                    System.out.print("Digite o ISBN do livro: ");
                    String isbn = scanner.nextLine();
                    System.out.print("Digite o título do livro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Digite o autor do livro: ");
                    String autor = scanner.nextLine();
                    Livro livro = new Livro(titulo, autor, isbn);
                    repositorioLivro.salvar(livro);
                    System.out.println("Livro adicionado com sucesso!");
                } else if (opcao == 2) {
                    System.out.print("Digite o ISBN do livro a ser removido: ");
                    String isbn = scanner.nextLine();
                    repositorioLivro.remover(isbn);
                    System.out.println("Livro removido com sucesso!");
                } else if (opcao == 3) {
                    System.out.print("Digite o ISBN do livro a ser consultado: ");
                    String isbn = scanner.nextLine();
                    Livro livro = repositorioLivro.obter(isbn);
                    if (livro != null) {
                        System.out.println("Livro encontrado: " + livro.getTitulo() + ", " + livro.getAutor());
                    } else {
                        System.out.println("Livro não encontrado.");
                    }
                } else if (opcao != 0) {
                    limparTela();
                    System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
                }
            } catch (InputMismatchException e) {
                limparTela();
                System.out.println("Entrada inválida! Por favor, insira um número.");
                scanner.next(); // limpa o buffer do scanner
            }catch (Exception e) {
                limparTela();
                System.out.println(e.getMessage());
            }
        } while (opcao != 0);
        scanner.close();
    }

    public static void limparTela() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }


}

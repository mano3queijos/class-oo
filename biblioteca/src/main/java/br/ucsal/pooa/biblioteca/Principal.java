package br.ucsal.pooa.biblioteca;




/**
 *
 */
public class Principal {
    public static void main(String[] args) {

//        RepositorioLivroBancoDeDados repositorioLivro = new RepositorioLivroBancoDeDados();
    	RepositorioLivroMemoria repositorioLivro = new RepositorioLivroMemoria();
    	new Menu(repositorioLivro).iniciar();
    }
}

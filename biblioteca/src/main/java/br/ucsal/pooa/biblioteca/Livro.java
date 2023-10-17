package br.ucsal.pooa.biblioteca;

public class Livro {

	@Validacao(ehISBN="sim")
	String isbn;
    String titulo;
    String autor;

    public Livro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    public void salvarNoBancoDeDados() {
        // Código para salvar o livro no banco de dados
    }

    public void carregarDoBancoDeDados(String isbn) {
        // Código para carregar o livro do banco de dados
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }
    

    // ... outros métodos
}
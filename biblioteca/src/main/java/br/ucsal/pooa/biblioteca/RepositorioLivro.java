package br.ucsal.pooa.biblioteca;

public interface RepositorioLivro {
	
	public void salvar(Livro livro) throws Exception;
	public Livro obter(String isbn);
	public void remover(String isbn);

}

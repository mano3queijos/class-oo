package br.ucsal.pooa.biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class RepositorioLivroMemoria implements RepositorioLivro {

	private List<Livro> livros = new ArrayList<Livro>();

	@Override
	public void salvar(Livro livro) throws Exception {
		// TODO Auto-generated method stub
		Validador validador = new Validador();
		if (obter(livro.getIsbn()) != null) {
			throw new IllegalArgumentException("Já existe livro com esse isbn: " + livro.getIsbn());
		}
		
		if(validador.validar(livro)) {			
			livros.add(livro);
		}
	}

	@Override
	public Livro obter(String isbn) {
		// TODO Auto-generated method stub
		for (int i = 0; i < livros.size(); i++) {
			if (livros.get(i).getIsbn().equals(isbn)) {
				return livros.get(i);
			}
		}

		return null;
	}

	@Override
	public void remover(String isbn) {
		// TODO Auto-generated method stub
		if (obter(isbn) == null) {
            throw new NoSuchElementException("Não foi encontrado livro com isbn: "+isbn);
        }
		livros.remove(obter(isbn));
	}
}

package br.ucsal.pooa.biblioteca;

import java.lang.reflect.Field;

public class Validador {

	public Boolean validar(Livro livro) throws Exception {
		Class<?> classe = livro.getClass();
		Field[] atributos = classe.getDeclaredFields();
		for (Field atributo : atributos) {
			atributo.setAccessible(true);
			if (atributo.isAnnotationPresent(Validacao.class)) {
				if (livro.isbn.length() != 13) {
					throw new Exception("O isbn do livro precisa ter 13 digitos!");
				}
			}
		}
		return true;
	}
}

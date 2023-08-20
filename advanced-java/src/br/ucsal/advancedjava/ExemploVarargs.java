package br.ucsal.advancedjava;

public class ExemploVarargs {

	public static void main(String[] args) {

		System.out.println(soma(1, 6));

		Integer[] array = { 7, 6, 6 };
		System.out.println(soma(array));
		
		System.out.println(somaVarargs(1,2,3,4,5,6,7,89));
	}

	static Integer soma(Integer a, Integer b) {
		return a + b;
	}

	static Integer soma(Integer[] array) {
		Integer total = 0;

		for (int i = 0; i < array.length; i++) {
			total += array[i];
		}
		return total;
		
	}
	static Integer somaVarargs(Integer... array) {
		Integer total = 0;

		for (int i = 0; i < array.length; i++) {
			total += array[i];
		}
		return total;
		
	}

}

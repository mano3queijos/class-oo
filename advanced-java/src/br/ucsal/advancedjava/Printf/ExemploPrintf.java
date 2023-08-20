package br.ucsal.advancedjava.Printf;

import java.util.Iterator;

public class ExemploPrintf {

	public static void main(String[] args) {

		System.out.printf("Hello %s", "Hello, world!");
		System.out.println();
		System.out.printf("Hello %S", "Hello, world!");

		System.out.printf("%c", 'c');
		System.out.println();
		System.out.printf("%C", 'c');

		System.out.println();

		Integer value = 12346789;
		System.out.printf("%d", value);

		System.out.println();

		Double floatPoint = 3.14159268;
		System.out.printf("%f", floatPoint);

		System.out.println();

		String helloWorld = "Hello World!";
		System.out.printf("%20s", helloWorld);

		System.out.println();

		System.out.printf("%-20s", helloWorld);

		System.out.println();

		System.out.printf("%+d", value);

		System.out.println();

		// coloca as casas decimais restantes
		System.out.printf("%015d", value);
		System.out.println();

		// formata com virgula
		System.out.printf("%,d", value);
		System.out.println();

		Integer value2 = -123456788;
		System.out.printf("% d", value2);
		
		System.out.println();
		System.out.printf("% d", value);
		
		System.out.println();
		System.out.printf("%.3f", floatPoint);
		
		System.out.println();
		System.out.printf("R$%10.2f", floatPoint);

		moreCompleteT();
	
	}
	
	
	private static void moreCompleteT() {

		Double[] prices = {10.000, 845023.495,892357.928,23.423};
		for (int i = 0; i < prices.length; i++) {

			System.out.printf("%s %02d: total de: R$%,10.2f%n", "item", i+1, prices[i]);
		}
		
	}

	
}

package br.ucsal.advancedjava.externalandinternalclasses;

public class ExempleExternalClass {

	private String text = "external text";

	public class Internal {
		private String text = "Internal text";

		private void printText() {
			// TODO Auto-generated method stub
			System.out.println(text);
			System.out.println(ExempleExternalClass.this.text);
		}
	}

	public static void main(String[] args) {
// se a classe interna fosse statica, não ia ser necessária a instancia da classe externa instancear a classe interna
		ExempleExternalClass external = new ExempleExternalClass();
		Internal internal = external.new Internal();
		
		internal.printText();
	}
}
//
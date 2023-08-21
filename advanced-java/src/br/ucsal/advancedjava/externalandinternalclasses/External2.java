package br.ucsal.advancedjava.externalandinternalclasses;

public class External2 {

	public void anyMethod() {
		
		
		class LocasClass{
			private String text = "local class text";
			public void printText() {
				System.out.println(text);
			}
		}
		
		LocasClass local = new LocasClass();
	local.printText();	
	}
	public static void main(String[] args) {
		External2 external = new External2();
		
		external.anyMethod();
	}
}

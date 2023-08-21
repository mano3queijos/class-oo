package br.ucsal.advancedjava.externalandinternalclasses;

public class Anonymous {

	public void printText() {
		// TODO Auto-generated method stub

		System.out.println("any text");
	
	}
	
	public static void main(String[] args) {
		
		Anonymous anonymous = new Anonymous() {
			
			public void printText() {
			System.out.println("any superscript text");
			
			}
		};
		
		anonymous.printText();
		
		
		Text text = new Text() {
			@Override
			 public void printText() {
				 System.out.println("Any text - interface");
			 }
		};
		
		text.printText();
		
	}
}

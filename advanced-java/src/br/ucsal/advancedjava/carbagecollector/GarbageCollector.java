package br.ucsal.advancedjava.carbagecollector;

public class GarbageCollector {

	
	
	public static void obterUsedMemory() {
		
		final int MB = 1024 * 1024;
		
		
		Runtime runtime = Runtime.getRuntime();
		
		System.out.println((runtime.totalMemory() - runtime.freeMemory())/MB);
		
	}
	
	public static void main(String[] args) {
		
		// be careful with this
		Contacts[] contacts = new Contacts[10000];
		
		for (int i = 0; i < contacts.length; i++) {
			Contacts contact = new Contacts("Emanuel"+i, "719838388579"+i, "emanuel.almeida@ucsal.edu.br"+i); 
			contacts[i] = contact;
		}
		
		System.out.println("Created contacts");
		
		contacts = null;
	
		obterUsedMemory();
		Runtime.getRuntime().runFinalization();
		Runtime.getRuntime().gc();
		
		System.out.println("contacts removed from memory");
		obterUsedMemory();
	}
}

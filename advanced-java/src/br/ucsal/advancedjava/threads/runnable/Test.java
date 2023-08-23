package br.ucsal.advancedjava.threads.runnable;

public class Test {


	
	public static void main(String[] args) {
		
		MyThreadRunnable thread1 = new MyThreadRunnable("#1 ", 1000);
		MyThreadRunnable thread2 = new MyThreadRunnable("#2 ", 200);
		MyThreadRunnable thread3 = new MyThreadRunnable("#3 ", 800);
		MyThreadRunnable thread4 = new MyThreadRunnable("#4 ", 400);
		
	}
}

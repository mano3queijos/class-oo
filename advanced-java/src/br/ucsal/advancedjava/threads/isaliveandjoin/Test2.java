package br.ucsal.advancedjava.threads.isaliveandjoin;

public class Test2 {

	public static void main(String[] args) {

		MyThreadRunnable thread1 = new MyThreadRunnable("#1 ", 500);
		MyThreadRunnable thread2 = new MyThreadRunnable("#2 ", 500);
		MyThreadRunnable thread3 = new MyThreadRunnable("#3 ", 500);

		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);

		t1.start();
		t2.start();
		t3.start();

		while (t1.isAlive() || t2.isAlive() || t3.isAlive()) {

			try {
				Thread.sleep(200);

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

		System.out.println("finished");

	}
}

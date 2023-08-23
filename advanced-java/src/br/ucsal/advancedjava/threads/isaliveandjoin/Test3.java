package br.ucsal.advancedjava.threads.isaliveandjoin;

public class Test3 {

	public static void main(String[] args) {

		MyThreadRunnable thread1 = new MyThreadRunnable("#1 ", 500);
		MyThreadRunnable thread2 = new MyThreadRunnable("#2 ", 700);
		MyThreadRunnable thread3 = new MyThreadRunnable("#3 ", 800);

		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);

		t1.start();
//
//		try {
//
//			t1.join();
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}

		t2.start();

//		try {
//
//			t2.join();
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}

		t3.start();

		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		System.out.println("finished");

	}
}

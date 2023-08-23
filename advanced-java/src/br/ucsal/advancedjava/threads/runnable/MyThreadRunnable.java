package br.ucsal.advancedjava.threads.runnable;

public class MyThreadRunnable implements Runnable {

	private String name;
	private Integer time;

	public MyThreadRunnable(String name, Integer time) {
		this.name = name;
		this.time = time;
		Thread t = new Thread(this);
		t.start(); 

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		try {
			for (int i = 0; i < 6; i++) {
				System.out.println(name + "count" + i);
				Thread.sleep(time);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(name +"execution f");

	}

}

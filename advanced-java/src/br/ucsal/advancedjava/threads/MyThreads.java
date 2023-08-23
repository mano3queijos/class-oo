package br.ucsal.advancedjava.threads;

public class MyThreads extends Thread {

	private String name;
	private Integer time;

	public MyThreads(String name, Integer time) {

		this.time = time;
		this.name = name;
		start();

	}

	public void run() {

		try {

			for (int i = 0; i < 6; i++) {
				System.out.println(name + " " + i);
				;
				Thread.sleep(time);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(name+ "end's the execution 😎😎");
	}

}

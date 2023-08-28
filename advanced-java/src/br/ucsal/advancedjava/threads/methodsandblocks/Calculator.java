package br.ucsal.advancedjava.threads.methodsandblocks;

public class Calculator {

    private int sum;

    public synchronized int sumArray(int[] array) {

        sum = 0;

        for (int i = 0; i < array.length; i++) {

            sum += array[i];

            System.out.println("running the sum" + Thread.currentThread().getName() + "somando o valor " + array[i]
                    + " com o total de " + sum);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        return sum;

    }

}

package br.ucsal.advancedjava.threads.methodsandblocks;

public class MyThreadSum implements Runnable {

    private String name;
    private int[] nums;

    private static Calculator calc = new Calculator();

    public MyThreadSum(String name, int[] nums) {
        this.name = name;
        this.nums = nums;
        new Thread(this, name).start();
    }

    @Override
    public void run() {

        System.out.println(this.name + "started");
        int sum = calc.sumArray(this.nums);

        System.out.println("the sum result for thread is: " + this.name + " é: " + sum);
    }

}
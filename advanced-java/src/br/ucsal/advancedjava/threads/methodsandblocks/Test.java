package br.ucsal.advancedjava.threads.methodsandblocks;

public class Test {

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5};

        MyThreadSum mts1 = new MyThreadSum("#1", array);
        MyThreadSum mts2 = new MyThreadSum("#2", array);
    }

}

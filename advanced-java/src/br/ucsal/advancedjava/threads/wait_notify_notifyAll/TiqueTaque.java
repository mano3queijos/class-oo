package br.ucsal.advancedjava.threads.wait_notify_notifyAll;

public class TiqueTaque {

    boolean tique;

    synchronized void tique(boolean isRunning) {

        if (!isRunning) {
            tique = true;
            notify();
            return;
        }
        System.out.print("Tique ");
        tique = true;
        notify();

        try {
            while (tique) {
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    synchronized void taque(boolean isRunning) {

        if (!isRunning) {
            tique = false;
            notify();
            return;
        }
        System.out.print("Taque ");
        tique = false;
        notify();

        try {
            while (!tique) {
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}

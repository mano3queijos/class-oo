package br.ucsal.advancedjava.threads.wait_notify_notifyAll;

public class ThreadTiqueTaque implements Runnable {

    TiqueTaque tt;
    Thread t;
    final int NUM = 5;

    public ThreadTiqueTaque(String name, TiqueTaque tt) {

        this.tt = tt;
        t = new Thread(this, name);
        t.start();
    }

    @Override
    public void run() {

        if (t.getName().equalsIgnoreCase("Tique")) {
            for (var i = 0; i < NUM; i++) {
                tt.tique(true);
            }
            tt.tique(false);
        } else {
            for (var i = 0; i < NUM; i++) {
                tt.taque(true);
            }
            tt.taque(false);
        }

    }
}

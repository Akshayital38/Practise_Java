package com.self.threads;

public class threadExamplesWithRun implements Runnable{

    public void run() {
        System.out.println("Running");
    }

    public static void main(String[] args) {
        Thread t = new Thread(new threadExamplesWithRun());
        t.run();
        t.run();
        t.start();


    }
}

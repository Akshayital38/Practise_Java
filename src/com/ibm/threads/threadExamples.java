package com.ibm.threads;

class D implements Runnable{

    public void run(){
        for(int i =0;i<5;i++){
            System.out.println(i+" hi");
        }
    }
}

class C implements Runnable{

    public void run(){

        for(int i =0;i<5;i++){
            System.out.println(i+" hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class A extends Thread{

    public void run(){

        for(int i =0;i<100;i++){
            System.out.println(i+" hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class B extends Thread{

    public void run(){
        for(int i =0;i<100;i++){
            System.out.println(i+" hi");
        }
    }
}

public class threadExamples {
    public static void main(String args[]) {

//        A obj = new A();
//        B obj1 = new B();
        C obj2 = new C();

        // setting and getting Priority of Threads

//        obj.setPriority(Thread.MAX_PRIORITY-1);
//        System.out.println(obj.getPriority());
//        System.out.println(obj1.getPriority());
//
//        obj.start();
//        obj1.start();


        Runnable obj = () ->{

                for(int i =0;i<5;i++){
                    System.out.println(i+" hi");
                    try {Thread.sleep(100);} catch (InterruptedException e) { throw new RuntimeException(e);}
                }

        };
        Runnable obj1 = () ->{

            for(int i =0;i<5;i++){
                System.out.println(i+" hello");
                try {Thread.sleep(100);} catch (InterruptedException e) { throw new RuntimeException(e);}
            }

        };

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);

        t1.start();
        t2.start();

    }
}

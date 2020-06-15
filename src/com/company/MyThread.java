package com.company;

/**
 * Created: @author Roger Holden
 */
public class MyThread extends Thread {

    @Override
    public void run(){

//        System.out.println("run() called from MyThread class.");
        String threadName = Thread.currentThread().getName();
        System.out.println("thread in run() =  : " + threadName);

//        printLoop();



    }


    public void printLoop() {

        String threadName = Thread.currentThread().getName();

        for (int i=0; i<4; i++ ){
            System.out.println("i is : " + i + "thread =  : " + threadName) ;

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }



    public MyThread(){

//        printLoop();
    }
}

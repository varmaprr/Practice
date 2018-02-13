package com.varma.bc;

import java.util.concurrent.BlockingQueue;

/**
 * Created by varma on 2/13/2018.
 */
public class Consumer implements Runnable {

    BlockingQueue<Integer> bq;

    public Consumer(BlockingQueue bq) {
        this.bq = bq;
    }

    public void run(){

        try {
            Thread.sleep(100);
            Integer i = bq.take();
            while (i != -1) {
                System.out.println("Consumed - "+i);
                i = bq.take();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}

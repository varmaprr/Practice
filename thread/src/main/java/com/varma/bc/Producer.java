package com.varma.bc;

import java.util.concurrent.BlockingQueue;

/**
 * Created by varma on 2/13/2018.
 */
public class Producer implements Runnable {

    BlockingQueue<Integer> bq;

    public Producer(BlockingQueue bq) {
        this.bq = bq;
    }

    public void run() {

        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(i*3000);
                bq.put(i);
                System.out.println("Produced - "+i);
            }

            bq.put(-1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

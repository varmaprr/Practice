package com.varma.bc;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by varma on 2/13/2018.
 */
public class BlockingQueueMain {

    public static void main(String[] args) {

        BlockingQueue<Integer> bq = new ArrayBlockingQueue(10);

        new Thread(new Producer(bq)).start();
        new Thread(new Consumer(bq)).start();

    }
}

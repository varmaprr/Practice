package com.varma.ds.interview;

import java.util.concurrent.*;

/**
 * Created by varma on 3/21/2018.
 */

class Message {
    private String unique_topic;
    private Integer sequence;

    public String getUnique_topic() {
        return unique_topic;
    }

    public void setUnique_topic(String unique_topic) {
        this.unique_topic = unique_topic;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    @Override
    public String toString() {
        return "Message{" +
                "unique_topic='" + unique_topic + '\'' +
                ", sequence=" + sequence +
                '}';
    }
}

class Producer implements Runnable {

    BlockingQueue<Message> queue;

    public Producer(BlockingQueue<Message> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {

            for (int i = 0; i < 100; i++) {
                Message mess = new Message();
                mess.setSequence(i);
                queue.add(mess);
                Thread.sleep(100);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


class Consumer implements Runnable {
    BlockingQueue<Message> queue;

    public Consumer(BlockingQueue<Message> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {

        try {
            System.out.println(queue.take());
        } catch (Exception e) {

        }
    }
}

public class MessageQueue {

    public static void main(String[] args) {
        BlockingQueue<Message> bq = new ArrayBlockingQueue<Message>(100);

        Producer producer = new Producer(bq);
        Consumer consumer = new Consumer(bq);

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        executorService.execute(producer);
        /*executorService.submit(() -> {
            Producer producer = new Producer(bq);
        });*/
        //new Thread(producer).start();
        new Thread(consumer).start();
    }


}

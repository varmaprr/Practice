package com.varma.ds.interview;

import java.util.Calendar;
import java.util.Random;
import java.util.concurrent.*;
import java.util.stream.IntStream;

/**
 * Created by varma on 3/21/2018.
 */

class Message {
    private String unique_topic;
    private Long timestamp;

    public Message(String unique_topic, Long timestamp) {
        this.unique_topic = unique_topic;
        this.timestamp = timestamp;
    }

    public String getUnique_topic() {
        return unique_topic;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "Message with " +
                "unique_topic='" + unique_topic + '\'' +
                ", timestamp=" + timestamp ;
    }
}

class Producer implements Runnable {

    public Integer MAX_INTERVAL = 100;

    BlockingQueue<Message> queue;


    public Producer(BlockingQueue<Message> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {

            String topic;

            for (int i = 0; ; i++) {
                topic = ""+Thread.currentThread().getName() + "_" + i;
                queue.add(new Message(topic, System.currentTimeMillis()));
                Thread.sleep(new Random().nextInt(MAX_INTERVAL));
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

        while (true) {
            try {
                System.out.println("Consumed: "+queue.take().toString());
            } catch (Exception e) {

            }
        }
    }
}

public class MessageQueue {

    public final static int QUEUE_CAPACITY = 10;
    public final static int NO_OF_PRODUCERS = 5;

    public static void main(String[] args) throws Exception {
        BlockingQueue<Message> bq = new ArrayBlockingQueue(QUEUE_CAPACITY);

        ExecutorService executorService = Executors.newFixedThreadPool(NO_OF_PRODUCERS);

        IntStream.range(0, NO_OF_PRODUCERS).forEach(i -> executorService.execute(new Producer(bq)));

        Consumer consumer = new Consumer(bq);

        new Thread(consumer).start();

    }


}

package com.varma.ds.heap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

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
        return "Message{" + "unique_topic='" + unique_topic + '\''
                + ", sequence=" + sequence + '}';
    }
}

class Producer implements Runnable {

    BlockingQueue<Message> queue;

    public Producer(BlockingQueue<Message> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {

                for (int i = 0; i < 10; i++) {
                    Message mess = new Message();
                    mess.setSequence(i);
                    mess.setUnique_topic(Thread.currentThread().getName());
                    queue.put(mess);
                    //System.out.println("Put this message " + mess);
                    Thread.sleep(3000);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
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
                Message msg = queue.take();
                System.out.println("Got this message " + msg);

            } catch (Exception e) {

            }
        }
    }
}

public class MessageQueue2 {

    public static void main(String[] args) {
        BlockingQueue<Message> bq = new ArrayBlockingQueue(10);

        Producer producer1 = new Producer(bq);
        Producer producer2 = new Producer(bq);
        Consumer consumer = new Consumer(bq);

        // ExecutorService executorService = Executors.newFixedThreadPool(3);
        new Thread(producer1).start();
        new Thread(producer2).start();
        new Thread(consumer).start();
    }

}
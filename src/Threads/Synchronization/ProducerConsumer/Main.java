package Threads.Synchronization.ProducerConsumer;

public class Main {
    public static void main(String[] args) {
        BlockedQueue bq = new BlockedQueue(10);
        new Thread(()->{
            for (int i = 0; i < 20; i++) {
                try {
                    bq.produce(i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();

        new Thread(()->{
            for (int i = 0; i < 20; i++) {
                try {
                    bq.consume();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }
}

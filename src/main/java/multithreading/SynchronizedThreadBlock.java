package multithreading;

public class SynchronizedThreadBlock {
    int count = 0;

    void increment(){
        synchronized (this){
            count++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SynchronizedThreadBlock synchronizedThreadBlock = new SynchronizedThreadBlock();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) synchronizedThreadBlock.increment();
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) synchronizedThreadBlock.increment();

        } );
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Count: "+ synchronizedThreadBlock.count);
    }
}

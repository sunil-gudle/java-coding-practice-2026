package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    public static void main(String[] args) {

        // Create a pool of 3 threads
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // submit 10 tasks - only 3 run at a time!
        for (int i = 1; i <=10 ; i++) {
            final int orderNumber = i;
            executorService.submit(() -> {
                System.out.println("Processing order " + orderNumber + " by " + Thread.currentThread().getName());

                try{
                    Thread.sleep(2000);
                } catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                }
                System.out.println("Order "+ orderNumber + " done!");
            });
        }
        executorService.shutdown();
        System.out.println("All orders submitted!");
    }
}

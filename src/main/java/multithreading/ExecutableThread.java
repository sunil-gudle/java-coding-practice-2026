package multithreading;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Sunil
 */

public class ExecutableThread {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(2);

        List<Integer> num = List.of(1,2,3,4,5);
        System.out.println(num);
        pool.submit(() -> System.out.println("Task in " + Thread.currentThread().getName()));
        pool.shutdown();
    }
}
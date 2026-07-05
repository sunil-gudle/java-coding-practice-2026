package multithreading;

// Creating a thread using Lambda expression


public class MyThreadExample3 {
    public static void main(String[] args) {

        Thread t = new Thread(() ->
                System.out.println("Lambda thread is running..."));

        t.start();
    }
}

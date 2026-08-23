package multithreading;

// Creating Multiple Threads

public class MyThreadExample4 extends Thread {
    public void run() {
        System.out.println(getName());
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new MyThreadExample4().start();
        }
    }
}

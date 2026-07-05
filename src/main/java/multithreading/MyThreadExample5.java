package multithreading;

// creating multiple threads using lambda expressions

public class MyThreadExample5 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
           Thread t = new Thread(()-> System.out.println(Thread.currentThread().getName()));
           t.start();
        }
    }
}

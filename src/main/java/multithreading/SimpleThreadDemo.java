package multithreading;

public class SimpleThreadDemo {
    public static void main(String[] args) {
        System.out.println("Main Thread: " + Thread.currentThread().getName());

        Thread chef1 = new Thread(() -> {
            System.out.println("Chef 1 is making pizza! Thread: " + Thread.currentThread().getName());
        });
        Thread chef2 = new Thread(() -> {
            System.out.println("Chef 2 is baking pizza! Thread: " + Thread.currentThread().getName());
        });
        Thread chef3 = new Thread(() -> {
            System.out.println("Chef 3 is delivering pizza! Thread: " + Thread.currentThread().getName());
        });

        chef1.start();
        chef2.start();
        chef3.start();
    }
}

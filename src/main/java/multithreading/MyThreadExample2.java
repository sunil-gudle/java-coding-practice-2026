package multithreading;

// Creating a thread using Runnable


public class MyThreadExample2 implements Runnable {
    public void run(){
        System.out.println("Thread is running....");
    }

    public static void main(String[] args) {
        MyThreadExample2 myThread2 = new MyThreadExample2();
        Thread t = new Thread(myThread2);
        t.start();
    }

}

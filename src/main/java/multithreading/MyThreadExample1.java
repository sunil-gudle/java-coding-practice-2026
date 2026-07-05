package multithreading;

// Creating a thread by extending Thread

public class MyThreadExample1 extends Thread{

    public void run(){
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        MyThreadExample1 thread1 = new MyThreadExample1();
        thread1.start();
    }
}

package Thrading;

public class multi {

    class MyRunnable implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getId() + " - Count: " + i);
            }
        }
    }

    public class MultiThreadExample {
        public static void main(String[] args) {
            // Create two instances of MyRunnable
            MyRunnable myRunnable1 = new MyRunnable();
            MyRunnable myRunnable2 = new MyRunnable();

            // Create two threads and associate them with MyRunnable instances
            Thread thread1 = new Thread(myRunnable1);
            Thread thread2 = new Thread(myRunnable2);

            // Start the threads
            thread1.start();
            thread2.start();
        }
    }


}

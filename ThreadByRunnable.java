public class ThreadByRunnable {
    public static void main(String[] args) {
        Thread th = new Thread(new MyThread());
        System.out.println("Thread created by main");
        th.start();
        System.out.println("Is thread alive? "+ th.isAlive());
    }
}

class MyThread implements Runnable{
    public void run(){
        System.out.println("Thread is running..");
    }
}
public class IsThreadAlive {
    public static void main(String[] args) {
        System.out.println("Main thread...");
        Thread th1 = new Thread(new MyThread());
        System.out.println("Is Thread Alive: " + th1.isAlive());
        th1.start();
        System.out.println("Is Thread Alive: " + th1.isAlive());

    }
}

// class MyThread extends Thread{
class MyThread implements Runnable{ // extends and implements both will produce the same output
    public void run(){
        try{
            // System.out.println("Thread is alive: "+Thread.currentThread().isAlive());
            System.out.println("Thread is running..");
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
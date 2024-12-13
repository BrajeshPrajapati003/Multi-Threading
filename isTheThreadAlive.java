public class isTheThreadAlive {
    public static void main(String[] args) throws Exception{
        Thread t= new Thread(new MyThread());
        System.out.println("is thread alive? "+ t.isAlive());
        t.start();
        System.out.println("is thread alive? "+t.isAlive());
        Thread.sleep(100);
        System.out.println("is thread alive? "+ t.isAlive());
        t.interrupt();
        System.out.println("is thread alive? "+ t.isAlive());

    }
}

class MyThread implements Runnable{
    public void run(){
        System.out.println("Thread is running....");
    }
}
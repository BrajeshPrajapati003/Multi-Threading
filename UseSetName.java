public class UseSetName {
    public static void main(String[] args) {
        MyThread t = new MyThread();    
        t.start();
        // System.out.println("Returning to the main thread");
    }

    static class MyThread extends Thread{
        public void run(){
            System.out.println("Current thread name: "+Thread.currentThread().getName());
            System.out.println("Changing the name of the current thread:");
            Thread.currentThread().setName("Brajesh wali thread...");
            System.out.println("Current Thread's new name is: "+Thread.currentThread().getName());
        }
    }
}
public class ThreadInterruptedExecution{
    public static void main(String[] args) {
        MyInterrupt myThread = new MyInterrupt();
        Thread t = new Thread(myThread);
        t.start();

        try{
            Thread.sleep(3000); // Sleep for 3 seconds
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        t.interrupt(); // Interrupt the thread
    }
    static class MyInterrupt implements Runnable{
        public void run(){
            System.out.println("Before Interrution!");
            while(!Thread.currentThread().isInterrupted()){
                System.out.println("Thread is running...");
                try{
                    Thread.sleep(1000); // Sleep for 1 second
                }catch(InterruptedException e){
                    Thread.currentThread().interrupt(); // Restore interrupted status
                System.out.println("Thread was interrupted");
                }
            }
        System.out.println("Thread stopped!");
        }
    }
}
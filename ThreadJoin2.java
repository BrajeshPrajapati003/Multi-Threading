public class ThreadJoin2 {
    public static void main(String[] args) {
        Thread th1 = new Thread(new MyRunnable(), "Thread 1");
        Thread th2 = new Thread(new MyRunnable(), "Thread 2");
        Thread th3 = new Thread(new MyRunnable(), "Thread 3");

        th1.start();
        th2.start();
        th3.start();

        try{
            th1.join(); // Wait for thread 1 to complete
            System.out.println(th1.getName()+" has completed.");
            
            th2.join();
            System.out.println(th2.getName()+" has completed.");

            th3.join();
            System.out.println(th3.getName()+" has completed.");
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("All threads have completed.");
    }

    static class MyRunnable implements Runnable{
        public void run(){
            System.out.println(Thread.currentThread().getName()+" is running...");
            try{
                Thread.sleep(2000); // Sleep for 2 seconds
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+" has completed.");
        }
    }
}
public class CreateThreadGroup {
    public static void main(String[] args) {
        ThreadGroup tGroup = new ThreadGroup("MyThreadGroup");
        Thread t1 = new Thread(tGroup, new MyRunnable(), "Thread 1");
        Thread t2 = new Thread(tGroup, new MyRunnable(), "Thread 2");

        t1.start();
        t2.start();

        // Print active thread count in the thread group
        System.out.println("Active threads in Thread Group: "+ tGroup.activeCount());

        // Print details of threads in the thread group
        System.out.println("Threads in Thread Group: ");
        Thread[] threads = new Thread[tGroup.activeCount()];
        tGroup.enumerate(threads);

        for(Thread th: threads){
            System.out.println(th.getName());
        }
    }
    
    static class MyRunnable implements Runnable{
        public void run(){
            System.out.println(Thread.currentThread().getName()+" is Running...");
            try{
                Thread.sleep(2000); // Sleep for 2 seconds
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+" has completed.");
        }
    }
}
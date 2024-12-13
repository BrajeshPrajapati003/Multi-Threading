public class CreateThreadGroup2 {
    public static void main(String[] args) {
        ThreadGroup thGroup = new ThreadGroup("MyThreadGroup");

        Thread th1 = new Thread(thGroup, new MyRunnable(), "Thread 1");
        Thread th2 = new Thread(thGroup, new MyRunnable(), "Thread 2");

        th1.start();
        th2.start();

        //Print active thread count in the thread group
        System.out.println("Active Threads: "+thGroup.activeCount());

        //Print details of threads in thread group
        System.out.println("threads in thread group:");
        Thread[] threads = new Thread[thGroup.activeCount()];
        thGroup.enumerate(threads);
        for(Thread th: threads){
            System.out.println(th.getName());
        }
    }

    static class MyRunnable implements Runnable{
        public void run(){
            System.out.println(Thread.currentThread().getName());

            try{
                Thread.sleep(5000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+" has completed.");
        }
    }
}

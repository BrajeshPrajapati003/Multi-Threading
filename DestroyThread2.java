public class DestroyThread2 {
    public static void main(String[] args) {
        // Create a Thread Group
        ThreadGroup tGroup = new ThreadGroup("MyThreadGroup");
        Thread t1 = new Thread(tGroup, new MyRunnable(), "thread 1");
        Thread t2 = new Thread(tGroup, new MyRunnable(), "thread 2");

        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        // Delete the threadGroup along with its subgroups
        tGroup.destroy();
        System.out.println("Thread group destroyed");
    }
    static class MyRunnable implements Runnable{
        public void run(){
            System.out.println(Thread.currentThread().getName());
        }
    }
}

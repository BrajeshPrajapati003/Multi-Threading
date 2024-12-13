public class DestroyThread {
    public static void main(String[] args) {
        
        // Create a new thread group
        ThreadGroup myThreadGroup = new ThreadGroup("MyThreadGroup");

        // Create a new thread and add it to the thread group
        Thread myThread = new Thread(myThreadGroup, new MyRunnable());
        myThread.start();

        // Sleep for some time to allow the thread to execute
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        // Destroy the thread group and all its subgroups
        myThreadGroup.destroy();
        System.out.println("Thread group destroyed..");
    }

    static class MyRunnable implements Runnable{
        public void run(){
            try{
                // Simulate some work
                Thread.sleep(5000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
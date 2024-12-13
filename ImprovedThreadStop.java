public class ImprovedThreadStop {
    public static void main(String[] args) throws InterruptedException{
        MyThread th = new MyThread();
        th.start();
        Thread.sleep(4000);
        th.stopThread();
    }

    static class MyThread extends Thread{
        private volatile boolean shouldStop = false;
        public void run(){
            while(!shouldStop){
                System.out.println("Thread is running...");
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    // Handle the interruption gracefully
                    shouldStop = true;
                }
            }
            // Clean up resources here (e.g., close files, release locks)
            System.out.println("Thread stopped!");
        }
        public void stopThread(){
            shouldStop =  true;
            interrupt(); // To wake up the thread if it's blocked
        }
    }
}

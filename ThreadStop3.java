public class ThreadStop3 {
    public static void main(String[] args) throws InterruptedException{
        MyThread thread = new MyThread();
        thread.start();
        Thread.sleep(5000);
        thread.stopThread();
    }

    static class MyThread extends Thread{
        private volatile boolean shouldStop = false;
        public void run(){
            while(!shouldStop){
                System.out.println("Thread is running...");
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    shouldStop = true;
                }
            }
            System.out.println("Thread Stopped!!");
        }
        public void stopThread(){
            shouldStop = true;
            interrupt();
        }
    }
}

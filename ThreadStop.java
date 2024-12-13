public class ThreadStop {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        try{
            Thread.sleep(3000); // Sleep for 3 seconds
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        myThread.stopThread(); // Stop the thread
    }

    static class MyThread extends Thread{
        public void run(){
            while(!Thread.currentThread().isInterrupted()){
                System.out.println("Thread is running...");
                try{
                    Thread.sleep(1000); // Sleep for 1 second
                }catch(InterruptedException e){
                    Thread.currentThread().interrupt(); // Restore interrupted status
                }
            }
            System.out.println("Thread Stopped!!");
        }
        public void stopThread(){
            interrupt();
        }
    }
}

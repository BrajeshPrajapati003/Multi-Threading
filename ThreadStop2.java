public class ThreadStop2 {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        thread.start();
        Thread.sleep(4000);
        thread.stopThread();
    }
    static class MyThread extends Thread{
        public void run(){
            while(!Thread.currentThread().isInterrupted()){
                System.out.println("Thread is running...");
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println("Thread stopped!");
        }
        public void stopThread(){
            interrupt();
        }
    }
}
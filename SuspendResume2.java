public class SuspendResume2 {
    public static void main(String[] args) throws InterruptedException{
        MyThread th = new MyThread();
        th.start();
        
        Thread.sleep(2000); 
        th.suspendThread();

        Thread.sleep(2000);
        th.resumeThread();
    }

    static class MyThread extends Thread{
        private volatile boolean suspended;
        public void run(){
            // throws can't be used with a thread it needs to be manually handled so we can't use methods predefined in the Exception class we need to manually handle the exceptions
            while(true){
                System.out.println("Thread is running...");
                try{
                    Thread.sleep(2000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                while(suspended){
                    Thread.yield();
                }
            }
        }
        public void suspendThread(){
            suspended = true;
        }
        public void resumeThread(){
            suspended = false;
        }
    }
}

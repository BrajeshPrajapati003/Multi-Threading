public class SuspendResume3 {
    public static void main(String[] args) throws InterruptedException{
        MyThread th = new MyThread();
        th.start();

        Thread.sleep(2000);
        th.suspendThread();

        Thread.sleep(2000);
        th.resumeThread();
    }

    static class MyThread extends Thread{
        private volatile boolean suspended = false;
        public void run(){
            while(true){
                synchronized (this){
                    while(suspended){
                        try{
                            wait();
                        }catch(InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                }
                System.out.println("Thread is running");

                try{
                    Thread.sleep(2000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }

        public void suspendThread(){
            synchronized (this){
                suspended = true;
                notify(); // wake up the thread to enter the waiting state
            }
        }
        
        public void resumeThread(){
            synchronized(this){
                suspended = false;
                notify(); // wake up the thread to continue execution
            }
        }
    }
}
public class SuspendResumePractice2 {
    public static void main(String[] args) throws InterruptedException{
        MyThread th = new MyThread();
        th.start();
        
        Thread.sleep(1000);
        th.suspendThread();

        Thread.sleep(1000);
        th.resumeThread();
    }

    static class MyThread extends Thread{
        private volatile boolean suspended = false;
        public void run(){
            while(true){
                synchronized(this){
                    while(suspended){
                        try{
                            wait();
                        }catch(InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                }
                
                System.out.println("Thread is running...");

                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }

        public void suspendThread(){
            synchronized(this){
                suspended = true;
                notify();
            }
        }

        public void resumeThread(){
            synchronized(this){
                suspended = false;
                notify();
            }
        }
    }
}

public class ThreadSuspendResume{
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        try{
            Thread.sleep(1000); // Sleep for 1 second
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        myThread.suspendThread(); // suspend the thread

        try{
            Thread.sleep(1000); // Sleep for 1 second
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        myThread.resumeThread(); // Resume the thread
        
    }

    static class MyThread extends Thread{
        private volatile boolean suspended;
        public void run(){
            while(true){
                System.out.println("Thread is running..");
                try{
                    Thread.sleep(1000); // Sleep for 1 second
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
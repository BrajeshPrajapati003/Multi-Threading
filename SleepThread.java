public class SleepThread {
    public static void main(String[] args) {
        System.out.println("Main Thread begins...");
        MyThread t1 = new MyThread();
        Thread t = new Thread(t1);
        t.start();
        System.out.println("Main thread ends.....!!!!");
    }

    public static class MyThread implements Runnable{
        public void run(){
            System.out.println("Trying to sleep the thread...");
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Exiting MyThread..");
        }
    }
}

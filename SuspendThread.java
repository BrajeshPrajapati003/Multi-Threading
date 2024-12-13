public class SuspendThread {
    public static void main(String[] args) {
        MyThread th = new MyThread();
        th.start(); // Start the thread
        try{
            Thread.sleep(2000); // Sleep for 2 seconds
            // th.suspend(); // Suspend the thread (shows error in modern java)
            Thread.sleep(2000);
            // th.resume(); // Resume the thread (shows error in modern java)
            System.out.println("Thread resumed");
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}

class MyThread extends Thread{
    @Override
    public void run(){
        for(int i=1; i<=10; i++){
            System.out.println("Count: "+i);
            try{
                Thread.sleep(500); // Sleep for 500 milliseconds
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
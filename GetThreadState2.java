public class GetThreadState2 {
    public static void main(String[] args) {
        System.out.println("Main thread..");
        Thread th = new Thread(new MyThread());
        Thread th2 = new Thread(new MyThread());
        th.start();
        th2.start();
    }
}

// class MyThread extends Thread{
class MyThread implements Runnable{ // both can be used at a time(extends and Runnable) -> same output
    public void run(){
        try{
            System.out.println("Thread State: "+ Thread.currentThread().getState());
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
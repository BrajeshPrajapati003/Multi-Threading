public class ExtendThreadClass extends Thread{
    public static void main(String[] args) {
        ExtendThreadClass thread = new ExtendThreadClass();
        thread.start();
        System.out.println("Outside the Thread...");
    }

    public void run(){
        System.out.println("Thread Executed...");
    }
}
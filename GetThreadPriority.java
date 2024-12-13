public class GetThreadPriority {
    public static void main(String[] args) {
        System.out.println("Main Thread Priority: "+Thread.currentThread().getPriority());
        MyThread t = new MyThread();
        t.start();
    }

    static class MyThread extends Thread{
        public void run(){
            System.out.println("MyThread priority: "+Thread.currentThread().getPriority());
            
            System.out.println("Set new priority to the MyThread priority:");
            Thread.currentThread().setPriority(8);
            System.out.println("MyThread priority: "+Thread.currentThread().getPriority());
            
        }
    }
}

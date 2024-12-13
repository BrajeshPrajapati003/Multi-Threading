public class UseSetName2 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.setName("Brajesh's thread");
        t.start();
    }
    static class MyThread extends Thread{
        public void run(){
            System.out.println("Thread name: "+Thread.currentThread().getName());
        }
    }
}
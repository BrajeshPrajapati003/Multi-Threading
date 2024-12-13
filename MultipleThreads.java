public class MultipleThreads {
    public static void main(String[] args) {
        Threads t1 = new Threads();
        Threads t2 = new Threads();
        Threads t3 = new Threads();
        Threads t4 = new Threads();

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
    static class Threads extends Thread{
        public void run(){
            for(int i=0; i<2; i++){
                System.out.println("Thread: "+ Thread.currentThread().getName()+" "+Thread.currentThread().threadId());
            }
        }
    }
}

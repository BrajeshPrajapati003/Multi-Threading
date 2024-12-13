public class ExtendThreadClass2 extends Thread{
    public static void main(String[] args) {
        System.out.println("Main method...");

        ExtendThreadClass2 t = new ExtendThreadClass2();
        t.start();
        System.out.println("Main method after Thread creation and calling...");
    }

    public void run(){
        System.out.println("Thread number 1");
    }
}

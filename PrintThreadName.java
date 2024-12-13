public class PrintThreadName {
    public static void main(String[] args) {
        System.out.println("Thread Name: "+Thread.currentThread().getName());
        System.out.println("Creating more threads..");
        Thread t1 = new Thread();
        Thread t2 = new Thread();
        t1.start();
        t2.start();

        System.out.println("Thread Name: "+t1.getName());
        System.out.println("Thread Name: "+t2.getName());
        System.out.println("Renaming the last thread");
        t2.setName("Thread created by Brajesh");
        System.out.println("Thread new name: "+t2.getName()); // setName() return void and getName() return String

        System.out.println("Thread Group: "+t2.getThreadGroup());
        System.out.println("Thread Priority: "+ t2.getClass());
        System.out.println("Thread Context ClassLoader: "+t2.getContextClassLoader());
        System.out.println("Thread Stack Trace: "+ t2.getStackTrace());
        System.out.println("Thread All Stack Traces: "+ Thread.getAllStackTraces());
        // System.out.println("Thread ID: "+Thread.currentThread().getId()); // Thread.getId() is deprecated from java version 19
        System.out.println("Thread ID:"+ t2.threadId());
    }
}

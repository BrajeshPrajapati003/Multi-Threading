public class GetInfoOfCurrentThread {
    public static void main(String[] args) {

        // Get the current executing thread
        Thread currThread = Thread.currentThread();

        // Print the thread information
        System.out.println("Thread name: "+currThread.getName());
        System.out.println("Thread ID: "+currThread.getId());
        System.out.println("Thread Priority: "+currThread.getPriority());
        System.out.println("Thread State: "+currThread.getState());
        System.out.println("Thread is Daemon: "+currThread.isDaemon());
        System.out.println("Thread is Alive: "+currThread.isAlive());
        System.out.println("Thread is Interrupted: "+currThread.isInterrupted());
    }
}
public class CountActiveThreads{
    public static void main(String[] args) {
        ThreadGroup tg = Thread.currentThread().getThreadGroup();
        int activeThreads = tg.activeCount();
        System.out.println("Active threads in the thread group: "+activeThreads);
    }
}
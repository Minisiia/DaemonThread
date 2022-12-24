package daemon_thread;

public class Main{
    public static void main (String[] args) {
        Thread t = new Thread(new Runnable() {public void run() { }});
        t.setDaemon(true);
        t.start();
        System.out.println("Чи є потік Daemon:  \t" + t.isDaemon());
        System.out.println("Чи виконується потік: \t" + t.isAlive());
        System.out.println("id потоку:  \t \t \t" + t.getId());
        System.out.println("Ім'я потоку:    \t \t" + t.getName());
        System.out.println("Пріорітет потоку:   \t" + t.getPriority());
        System.out.println("Стан потоку:  \t \t" + t.getState());
        System.out.println("ClassLoader:  \t \t" + t.getContextClassLoader());
        System.out.println("hashCode: \t \t \t" + t.hashCode());
    }
}

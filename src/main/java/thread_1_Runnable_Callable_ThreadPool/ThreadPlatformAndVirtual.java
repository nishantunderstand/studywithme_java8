package thread_1_Runnable_Callable_ThreadPool;

public class ThreadPlatformAndVirtual {
    public static void main(String[] args) {
        System.out.println("Hello World");

        // CPU Based Task
        // Platform Thread
        Thread t1 = new Thread(() -> {
            System.out.println("Platform Thread-1 ");
        });
        t1.start();

        Thread.ofPlatform().start(()->{
            System.out.println("Platform Thread -2");
        });

        // Virtual Thread
        // IO Based
        Thread.startVirtualThread(()->{
            System.out.println("Virtual Thread-1");
        });


        Thread.ofVirtual().start(()->{
            System.out.println("Virtual Thread-2");
        });

        // TODO  Difference B/W Them
    }
}


/**
 * Platform Thread: A heavyweight Java thread that maps directly to one Operating System thread (1:1 mapping).
 *
 * Virtual Thread: A lightweight JVM-managed thread introduced by Project Loom (Java 21)
 * that allows millions of concurrent tasks by multiplexing many virtual threads onto a small number of platform threads.
 *
 *
 */
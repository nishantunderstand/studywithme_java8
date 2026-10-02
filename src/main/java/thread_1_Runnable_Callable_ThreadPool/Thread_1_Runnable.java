package thread_1_Runnable_Callable_ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thread_1_Runnable {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newSingleThreadExecutor();

        Runnable task = ()->System.out.println("Hello By Runnable");
        ex.execute(task);

        ex.shutdown();
    }
}

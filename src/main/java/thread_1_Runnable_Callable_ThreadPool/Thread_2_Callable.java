package thread_1_Runnable_Callable_ThreadPool;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

// Please Note : You need to declare Checked Exception Otherwise it will not run.

public class Thread_2_Callable {
    public static void main(String[] args) throws Exception{
        ExecutorService ex = Executors.newSingleThreadExecutor();

        Callable<Integer> tk = () -> 1000;

        Future<Integer> f = ex.submit(tk); // Difference

        System.out.println(f.get());
        ex.shutdown();
    }
}

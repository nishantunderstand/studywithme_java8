package java8_L5_advanced;

import java.util.stream.IntStream;

public class StreamPerformance {

    public static void main(String[] args) {

        // Sequential Stream
        long startSeq = System.nanoTime();
        long seqSum = IntStream.rangeClosed(1, 20_000_000)
                               .sequential()
                               .reduce(0, Integer::sum);
        long endSeq = System.nanoTime();

        // Parallel Stream
        long startPar = System.nanoTime();
        long parSum = IntStream.rangeClosed(1, 20_000_000)
                               .parallel()
                               .reduce(0, Integer::sum);
        long endPar = System.nanoTime();

        // Results
        System.out.println("Sequential sum: " + seqSum +
                           " (Time = " + (endSeq - startSeq) / 1_000_000 + " ms)");

        System.out.println("Parallel sum:   " + parSum +
                           " (Time = " + (endPar - startPar) / 1_000_000 + " ms)");
    }
}

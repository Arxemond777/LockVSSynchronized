package benchmark;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author y.glushenkov
 */
@State(Scope.Benchmark)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@Fork(value = 2, warmups = 1, jvmArgs = {"-Xms2G", "-Xmx2G"}) // warmups entire fork
public class AppBenchmark {
    public static void main(String[] args) throws Exception {
        org.openjdk.jmh.Main.main(args);
    }

    @Param({"synchronized", "lock"})
    private String lockMode;

    private static class Counter {
        private long counter;
    }

    @State(Scope.Benchmark)
    public static class SynchronizedExample {
        Counter counter = new Counter();

        private static Object lock = new Object();
    }

    @State(Scope.Benchmark)
    public static class LockExample {
        Counter counter = new Counter();
        private static Lock lock = new ReentrantLock();
    }

    @Benchmark
    @Warmup(iterations = 3)
    @Measurement(iterations = 5) // count of iteration per benchmark
    public void measure(SynchronizedExample synchronizedExample, LockExample lockExample) {
        switch (lockMode) {
            case "synchronized":
                synchronizedBenchmark(synchronizedExample);
            case "lock":
                reentrantLockBenchmark(lockExample);
        }
    }


    public void reentrantLockBenchmark(LockExample lockExample) {
        lockExample.lock.lock();
        try {
            lockExample.counter.counter++;

        } finally {
            lockExample.lock.unlock();
        }
    }

    public void synchronizedBenchmark(SynchronizedExample synchronizedExample) {

        synchronized (synchronizedExample.lock) {
            synchronizedExample.counter.counter++;
        }
    }
}
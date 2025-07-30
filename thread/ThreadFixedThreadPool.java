package thread;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadFixedThreadPool {
    // SEM GARANTIA NA ORDEM, E PODE HAVER PERDA E NUMEROS REPETIDOS
    private static int COUNT;
    // SEM GARANTIA NA ORDEM, E PODE HAVER PERDA E NUMEROS REPETIDOS
    private static volatile int COUNT_VOLAT;
    // GARANTE QUE CADA THREAD ACESSARA OS DADOS ATUALIZADOS, POREM, NÃO GARANTE A ORDEM
    private static final AtomicInteger COUNT_ATOMIC = new AtomicInteger(0);

    private static Runnable noSafe() {
        return () -> System.out.printf("Result: %d%n", ++COUNT);
    }

    private static Runnable noSafeVolatile() {
        return () -> System.out.printf("Result: %d%n", ++COUNT_VOLAT);
    }

//    private void safe() {
//        synchronized(this) {
//            System.out.printf("Result: %d%n", COUNT_ATOMIC.incrementAndGet());
//        }
//    }

    public synchronized void safe2() {
        System.out.printf("Result: %d%n", ++COUNT);
    }

    private static synchronized void safe3() {
        System.out.printf("Result: %d%n", ++COUNT);
    }

    private void safe4() {
        synchronized(this) {
            System.out.printf("Result: %d%n", ++COUNT);
        }
    }

    private static Runnable safe() {
        return () -> {
            synchronized(ThreadFixedThreadPool.class) {
                System.out.printf("Result: %d%n", ++COUNT);
            }
        };
    }

    public static void main(final String[] args) {
        ThreadFixedThreadPool fixedThreadPool = new ThreadFixedThreadPool();
        ExecutorService service = Executors.newFixedThreadPool(20);
        try {
            for(int i = 0; i < 10; i++) {
//                service.submit(noSafe());
//                service.submit(noSafeVolatile());
//                service.submit(fixedThreadPool::safe2);
//                service.submit(ThreadFixedThreadPool::safe3);
                service.submit(fixedThreadPool::safe4);
            }
        } finally {
            service.shutdown();
        }
    }
}

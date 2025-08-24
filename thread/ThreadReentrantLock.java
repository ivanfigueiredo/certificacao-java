package thread;

import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadReentrantLock {
    private int COUNT;

    private final Lock lock = new ReentrantLock();

    // EXEMPLO COM SYNCHRONIZED
    private synchronized void safe() {
        System.out.printf("Result: %d%n", ++COUNT);
    }

    // EXEMPLO COM LOCK -> ReentrantLock
    private void safe2() {
        try {
            lock.lock();
            Thread.sleep(500);
            System.out.printf("Result: %d%n", ++COUNT);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            lock.unlock();
        }
    }

    public static void main(final String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(20);
        ThreadReentrantLock reentrantLock = new ThreadReentrantLock();
        try {
            for (int i = 0; i < 10; i++) {
                // synchronized
//                service.submit(reentrantLock::safe);
                service.submit(reentrantLock::safe2);
                if (reentrantLock.lock.tryLock(2, TimeUnit.SECONDS)) {
                    try {
                        System.out.println("Lock obtained, entering protected code");
                    } finally {
                        reentrantLock.lock.unlock();
                    }
                } else {
                    System.out.println("Unable to acquire lock, doing something else");
                }
            }
        } finally {
            service.shutdown();;
        }
    }
}

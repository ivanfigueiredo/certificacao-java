package thread;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadScheduledThreadPool {
    private static int COUNT;

    private static final AtomicInteger COUNT_ATOMIC = new AtomicInteger(0);

    public static void main(final String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(4);
//        Runnable executeIncrement = () -> ++COUNT;
        Runnable executeIncrement = COUNT_ATOMIC::incrementAndGet;
        Runnable executePrint = () -> System.out.printf("Value: %d%n", COUNT_ATOMIC.get());

        try {
            ScheduledFuture<?> result = scheduledExecutorService.scheduleAtFixedRate(executeIncrement, 2, 3, TimeUnit.SECONDS);
            scheduledExecutorService.scheduleAtFixedRate(executePrint, 2, 3, TimeUnit.SECONDS);
            result.get();
        } catch (ExecutionException | InterruptedException e ) {
            System.out.println("Finish!");
        } finally {
            scheduledExecutorService.shutdown();
        }
    }
}

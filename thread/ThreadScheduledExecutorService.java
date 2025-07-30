package thread;

import java.util.concurrent.*;

public class ThreadScheduledExecutorService {
    private static int COUNT = 0;

    public static void main(final String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        Runnable executeRun = () -> System.out.printf("Value: %d%n", COUNT);
        Callable<Integer> executeCall = () -> ++COUNT;
        Runnable executeIncrement = () -> ++COUNT;
        try {
//            scheduledExecutorService.schedule(executeCall, 6, TimeUnit.SECONDS);
//            scheduledExecutorService.schedule(executeRun, 10, TimeUnit.SECONDS);
//            scheduledExecutorService.scheduleAtFixedRate(executeIncrement, 4, 1, TimeUnit.MINUTES);
            ScheduledFuture<?> result = scheduledExecutorService.scheduleAtFixedRate(executeIncrement, 10, 1, TimeUnit.SECONDS);
            scheduledExecutorService.scheduleAtFixedRate(executeRun, 10, 5, TimeUnit.SECONDS);
            result.get();
        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            scheduledExecutorService.shutdown();
        }
    }
}

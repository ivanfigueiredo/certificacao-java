package thread;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadExecutorService {
    // RESULTADO INCONSISTENTE;
    private static int value;

    // LEVEMENTE CONSISTENTE, MAS NÃO GARANTE ATOMICIDADE NA ATUALIZAÇÃO ENTRE AS THREAD's
    private static volatile int value2;
    // GARANTE CONSISTÊNCIA, VISTO QUE, O ATRIBUTO É ATÔMICO ENTRE AS THREAD's, PORÉM, NÃO GARANTE A ORDEM
    private static final AtomicInteger value3 = new AtomicInteger(0);

    public static void main(final String[] args) {
        Runnable executeRun = () -> System.out.printf("Value: %d%n", ++value);
        Runnable executeRun1 = () -> System.out.printf("Value1: %d%n", ++value2);
        Runnable executeRun2 = () -> System.out.printf("Value1: %d%n", value3.incrementAndGet());
        Callable<Integer> executeCall = () -> 50;
        ExecutorService service = Executors.newSingleThreadExecutor();
        ExecutorService service1 = Executors.newCachedThreadPool();
        try {
            for (int i = 0; i < 10; i++) {
//                service.submit(executeRun);
                service1.submit(executeRun1);
//                service1.submit(executeRun2);
            }
//            Future<Integer> output = service.submit(executeCall);
//            System.out.printf("Result: %d%n", output.get());
        } finally {
            service.shutdown();
            service1.shutdown();
        }
    }
//    public static void main(final String[] args) {
//        Runnable executePrint = () -> System.out.println("Printing Inventory");
//        Runnable printRecords = () -> {
//            for (int i = 0; i < 3; i++) {
//                System.out.printf("Printing Record: %d%n", i);
//            }
//        };
//        ExecutorService service = Executors.newSingleThreadExecutor();
//        try {
//            System.out.println("start");
//            service.execute(executePrint);
//            service.execute(printRecords);
//            service.execute(executePrint);
//            System.out.println("end");
//        } finally {
//            service.shutdown();
//        }
//    }
}

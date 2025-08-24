package thread;

import java.util.concurrent.*;

public class CyclicBarrierEstudo {
    private static void removeLions() { System.out.println("Removing lions");   }
    private static void cleanPen()    { System.out.println("Cleaning the pen"); }
    private static void addLions()    { System.out.println("Adding lions");     }

    private static void performComCyclicBarrier(final CyclicBarrier c1) {
        try {
            removeLions();
            c1.await();
            cleanPen();
            c1.await();
            addLions();
        } catch (Exception e) {
            // Handle checked exceptions here
        }
    }

    private static void performSemCyclicBarrier() {
        try {
            removeLions();
//            c1.await();
            cleanPen();
//            c2.await();
            addLions();
        } catch (Exception e) {
            // Handle checked exceptions here
        }
    }

    public static void main(String[] args) {
        final var service = Executors.newFixedThreadPool(4);
        try {
            final var c1 = new CyclicBarrier(4);
//            final var c2 = new CyclicBarrier(7,
//                    () -> System.out.println("*** Pen Cleaned!"));
            for (int i = 0; i < 4; i++)
                service.submit(() -> performComCyclicBarrier(c1));
//                service.submit(() -> performSemCyclicBarrier());
        } finally {
            service.shutdown();
        }
    }
}

package thread;

public class ThreadEstudo2 {
    public static void pause() {
        try {
            Thread.sleep(10_000);
        } catch(InterruptedException e) {}
        System.out.println("Thread Finished");
    }

    private static int counter = 0;
    public static void main(String[] args) {
        final var mainThread = Thread.currentThread();
        new Thread(() -> {
            for(int i = 0; i < 1_000_000; i++) counter++;
            mainThread.interrupt();
        }).start();
        while(counter < 1_000_000) {
            System.out.println("Not reached yet");
            try {
                Thread.sleep(1_000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted!");
            }
        }
        System.out.println("Reached: "+counter);
    }

//    public static void main(final String[] args) {
//        var job = new Thread(() -> pause());
//        job.start();
//        System.out.println("Main method finished");
//    }
}

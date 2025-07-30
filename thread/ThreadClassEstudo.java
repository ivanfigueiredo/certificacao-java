package thread;

public class ThreadClassEstudo {
    public static void main(final String[] args) {
        Runnable executePrint = () -> System.out.println("Printing Inventory");
        Runnable printRecords = () -> {
            for (int i = 0; i < 3; i++) {
                System.out.printf("Printing Record: %d%n", i);
            }
        };
        System.out.println("start");
        new Thread(executePrint).start();
        new Thread(printRecords).start();
        new Thread(executePrint).start();
        System.out.println("end");
    }
}

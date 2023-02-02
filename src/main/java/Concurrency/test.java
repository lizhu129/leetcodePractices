package Concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class test {

    public static void main(String...args) {

        Runnable printInventory = () -> System.out.println(
                "Printing zoo inventory");
        Runnable printRecord = () -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Printing record: " + i);
            }
        };

        System.out.println("begin");
        new Thread(printInventory).start();
        new Thread(printRecord).start();
        new Thread(printInventory).start();
        System.out.println("end");


        ExecutorService service = Executors.newSingleThreadExecutor();
        try {
            System.out.println("begin");
            service.execute(printInventory);
            service.execute(printRecord);
            service.execute(printInventory);
            System.out.println("end");
        } finally {
            service.shutdown();
        }

        Future<?> future = service.submit(() -> System.out.println("Hello"));
    }
}

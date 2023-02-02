package lambdas;

import java.io.FileNotFoundException;
import java.io.IOException;

public class StuckTurkeyCage implements AutoCloseable {
    @Override
    public void close() throws IOException {
        throw new FileNotFoundException();
    }

    public static void main(String[] args) throws Exception {
        try (StuckTurkeyCage t = new StuckTurkeyCage()) {
            System.out.println("put turkeys in");
        }
    }
}

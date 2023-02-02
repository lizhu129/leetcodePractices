package lambdas;

public class SnowStorm {

    static class WalkToSchool implements AutoCloseable {

        @Override
        public void close()  {
            throw new RuntimeException("flurry");
        }
    }

    public static void main(String...args) {
        WalkToSchool w1 = new WalkToSchool();
        try (w1; var w2 = new WalkToSchool()) {
            throw new RuntimeException("blizzard");
        } catch (Exception e) {
            System.out.println(e.getMessage() + " "
            + e.getSuppressed().length);
        }
    }
}

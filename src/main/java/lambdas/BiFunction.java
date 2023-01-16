package lambdas;

@FunctionalInterface
public interface BiFunction<T, U, R> {
    R apply(T t, U u);

    public static void main(String[] args) {
        BiFunction<String, String, String> b1 = String::concat;
        BiFunction<String, String, String> b2 = (x, y) -> x.concat(y);

        System.out.println(b2.apply("abc", "def"));
    }
}

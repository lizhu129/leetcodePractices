package lambdas;

@FunctionalInterface
public interface Function<T, R> {
    R apply(T t);

    public static void main(String[] args) {
        Function<String, Integer> f1 = String::length;
        Function<String, Integer> f2 = x -> x.length();

        System.out.println(f1.apply("asd"));
    }
}

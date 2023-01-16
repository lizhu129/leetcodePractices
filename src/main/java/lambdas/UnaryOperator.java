package lambdas;

@FunctionalInterface
public interface UnaryOperator<T> extends Function<T, T> {

    public static void main(String[] args) {
        UnaryOperator<String> u1 = String::toUpperCase;
        UnaryOperator<String> u2 = x -> x.toUpperCase();

        System.out.println(u1.apply("abc"));
    }
}

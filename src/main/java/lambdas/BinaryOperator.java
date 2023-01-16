package lambdas;

public interface BinaryOperator<T> extends BiFunction<T, T, T> {

    public static void main(String[] args) {
        BinaryOperator<String> b1 = String::concat;
        BinaryOperator<String> b2 = (x, y) -> x.concat(y);

        System.out.println(b2.apply("QWE", "ASD"));

    }

}

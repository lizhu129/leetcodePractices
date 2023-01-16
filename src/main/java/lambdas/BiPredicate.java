package lambdas;

public interface BiPredicate<T, U> {
    boolean test(T t, U u);

    public static void main(String[] args) {
        BiPredicate<String, String> p1 = String::startsWith;
        BiPredicate<String, String> p2 = (x, y) -> x.startsWith(y);

        System.out.println(p1.test("ACV", "A"));
    }
}

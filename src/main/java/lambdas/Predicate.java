package lambdas;

@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);

    public static void main(String[] args) {
        Predicate<String> p1 = String::isEmpty;
        Predicate<String> p2 = x -> x.isEmpty();

        System.out.println(p1.test(""));

        Predicate<String> egg = x -> x.contains("egg");
        Predicate<String> brown = x -> x.contains("brown");
        

    }
}

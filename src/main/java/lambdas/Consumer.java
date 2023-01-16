package lambdas;

@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);

    public static void main(String[] args) {

        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = x -> System.out.println(x);

        c1.accept("Annie");
    }
}


package lambdas;

import java.util.HashMap;

@FunctionalInterface
public interface BiConsumer<T, U> {
    void accept(T t, U u);

    public static void main(String[] args) {
        var map = new HashMap<String, Integer>();
        BiConsumer<String, Integer> b1 = map::put;
        BiConsumer<String, Integer> b2 = (k, v) -> map.put(k, v);

        b1.accept("chicken", 7);
    }
}

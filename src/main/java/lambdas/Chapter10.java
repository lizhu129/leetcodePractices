package lambdas;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Chapter10 {

    public static Optional<Double> average(int...scores) {
        if (scores.length == 0) return Optional.empty();
        int sum = 0;
        for (int score : scores) sum += score;
        return Optional.of((double) sum / scores.length);
    }

    public static void main(String[] args) {
        System.out.println(average(100, 90));
        System.out.println(average());

        Optional<Double> opt = average(90, 100);
        if (opt.isPresent())
            System.out.println(opt.get());

        Optional<Double> opt2 = average();
        System.out.println(opt2.orElse(Double.NaN));
        System.out.println(opt2.orElseGet(() -> Math.random()));


        Stream<String> empty = Stream.empty();
        Stream<Integer> singleElement = Stream.of(1);
        Stream<Integer> fromArray = Stream.of(1, 2, 3);

        var list = List.of("a", "b", "c");
        Stream<String> fromList = list.stream();
        Stream<String> fromListParallel = list.parallelStream();

        Stream<Double> randoms = Stream.generate(Math::random);
        Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);
        Stream<Integer> oddNumbersUnder100 = Stream.iterate(
                1,
                n -> n < 100,
                n -> n + 2);

        Stream<String> s = Stream.of("monkey", "ape", "bonobo");
        Optional<String> min = s.min((s1, s2) -> s1.length()-s2.length());
        min.ifPresent(System.out::println);
        Optional<?> minEmpty = Stream.empty().min((s1, s2) -> 0);
        System.out.println(minEmpty.isPresent());

    }
}

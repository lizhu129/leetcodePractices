package lambdas;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.*;

public class streamsPractice {

    public static void main(String[] args) {
        double result = LongStream.of(6L, 8L, 10L)
                .mapToInt(x -> (int) x)
                .boxed()
                .collect(Collectors.groupingBy(x -> x, Collectors.toSet()))
                .keySet()
                .stream()
                .collect(Collectors.averagingInt(x -> x));

        System.out.println(result);

        var list = List.of("a", "b", "c");
        var list2 = list.stream().sorted((a, b) -> b.compareTo(a))
                .collect(Collectors.toList());

        var is = IntStream.empty();
        System.out.println(is.sum());

        var stream = LongStream.of(1, 2, 3);
        var opt = stream.map(n -> n * 10)
                .filter(n -> n < 5).findFirst();
        opt.ifPresent(System.out::println);

        System.out.println(Stream.iterate(1, x -> ++x)
                .limit(5).map(x -> "" + x)
                .collect(Collectors.joining()));

        Set birds = Set.of("oriole", "flamingo");
        Stream.concat(birds.stream(), birds.stream())
                .sorted()
                .distinct()
                .findAny()
                .ifPresent(System.out::println);


        Stream<Integer> s = Stream.of(1);
        DoubleStream ds = s.mapToDouble(x -> x);

        var s2 = DoubleStream.of(1.2, 2.4);
        s2.peek(System.out::println).filter(x -> x > 2).count();




    }
}

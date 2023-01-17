package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public record CrateRecord<T>(T contents) {
    @Override
    public T contents() {
        if (contents == null) {
            throw new IllegalStateException();
        }
        return contents;
    }

    public static void printList(List<?> list) {
        for (Object x : list) {
            System.out.println(x);
        }
    }

    public static long total(List<? extends Number> list) {
        long count = 0;
        for (Number number : list) {
            count += number.longValue();
        }
        return count;
    }

    public static void main(String[] args) {
        List<String> keywords = new ArrayList<>();
        keywords.add("java");
        printList(keywords);

        List<? extends Number> list2 = new ArrayList<Integer>();

        TreeSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(10);
        set.add(8);
        System.out.println(set.toString());
    }
}

package lambdas;

import java.util.*;

public class SortRabbits {
    static record Rabbit(int id) {}
    public static void main(String[] args) {
        List<Rabbit> rabbits = new ArrayList<>();
        rabbits.add(new Rabbit(3));
        rabbits.add(new Rabbit(1));
        Comparator<Rabbit> c = (r1, r2) -> r1.id - r2.id;
        Collections.sort(rabbits, c);
        System.out.println(rabbits);

        Set<Rabbit> rabbits2 = new TreeSet<>((r1, r2) -> r1.id - r2.id);
        rabbits2.add(new Rabbit(1));

        List<String> bunnies = new ArrayList<>();
        bunnies.add("long ear");
        bunnies.add("floppy");
        bunnies.add("hoppy");
        bunnies.sort((b1, b2) -> b1.compareTo(b2));
        System.out.println(bunnies);
    }
}

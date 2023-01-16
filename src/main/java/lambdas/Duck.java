package lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Duck implements Comparable<Duck> {
    private String name;
    private int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name;
    }


    @Override
    public int compareTo(Duck o) {
        return name.compareTo(o.name);
    }

    public static void main(String[] args) {
        Comparator<Duck> byWeight = new Comparator<Duck>() {
            @Override
            public int compare(Duck o1, Duck o2) {
                return o1.getWeight() - o2.getWeight();
            }
        };

        Comparator<Duck> byWeight2 = (d1, d2) -> d1.getWeight() - d2.getWeight();
        Comparator<Duck> byWeight3 = Comparator.comparing(Duck::getWeight);

        List<Duck> ducks = new ArrayList<>();
        ducks.add(new Duck("Quack", 7));
        ducks.add(new Duck("Puddles", 10));
        Collections.sort(ducks);
        System.out.println(ducks);
        Collections.sort(ducks, byWeight2);
        System.out.println(ducks);
    }
}

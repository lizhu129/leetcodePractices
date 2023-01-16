package lambdas;

public class Tiger implements Sprint {

    @Override
    public void sprint(int speed) {
        System.out.println("Animal is sprinting fast! " + speed);
    }
}

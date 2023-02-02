package lambdas;

import java.text.NumberFormat;
import java.util.Locale;

public record Wallet(double money) {

    private String openWallet() {
        Locale.setDefault(Locale.Category.DISPLAY, new Locale.Builder().setRegion("us").build());
        Locale.setDefault(Locale.Category.FORMAT, new Locale.Builder().setRegion("en").build());
        return NumberFormat.getCurrencyInstance(Locale.GERMANY).format(money);
    }

    public void printBalance() {
        System.out.println(openWallet());
    }

    public static void main(String...args) {
        new Wallet(2.4).printBalance();
    }
}

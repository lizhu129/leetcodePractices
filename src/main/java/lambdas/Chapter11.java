package lambdas;

import java.io.Closeable;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Chapter11 {

    public static void main(String...args) {
        Locale locale = Locale.getDefault();
        System.out.println(locale);
        System.out.println(Locale.FRENCH);
        System.out.println(Locale.CHINA);

        Locale l1 = new Locale.Builder()
                .setRegion("US")
                .setLanguage("en")
                .build();

        BigDecimal price = BigDecimal.valueOf(48);
        var myLocale = NumberFormat.getCurrencyInstance();
        System.out.println(myLocale.format(price));


    }


}

package java17;

import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumberFormat {

    public static void main(String[] args) {
        NumberFormat formatUS = NumberFormat.getCompactNumberInstance(Locale.ENGLISH, NumberFormat.Style.SHORT);
        NumberFormat formatKR = NumberFormat.getCompactNumberInstance(Locale.KOREA, NumberFormat.Style.SHORT);
        System.out.println(formatUS.format(1000));
        System.out.println(formatUS.format(100000));
        System.out.println(formatUS.format(1000000));

        System.out.println(formatKR.format(1000));
        System.out.println(formatKR.format(100000));
        System.out.println(formatKR.format(1000000));
    }
}

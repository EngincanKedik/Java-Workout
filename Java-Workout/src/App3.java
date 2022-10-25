
import java.util.Scanner;

public class App3 {
    public static void main(String [] args)
    {
        CountDigitsTest.run();
    }

}

class CountDigitsTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        int val;

        System.out.print("Bir sayi giriniz: ");

        while ((val = Integer.parseInt(kb.nextLine())) != 0) {
            System.out.printf("%d sayısının basamak değeri: %d%n", val, NumberUtil.countDigits(val));
            System.out.print("Bir sayi giriniz: ");
        }

        System.out.printf("0 sayısının basamak değeri: %d%n", NumberUtil.countDigits(val));
    }
}

class NumberUtil {
    public static int countDigits(int val)
    {
        int count = 0;

        if (val == 0)
            return 1;

        while (val != 0) {
            ++count;
            val /= 10;
        }

        return count;
    }
}

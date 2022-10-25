
import java.util.Scanner;

public class App4 {
    public static void main(String [] args)
    {
        SumDigitsTest.run();
    }

}

class SumDigitsTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        int val;

        System.out.print("Bir sayi giriniz: ");

        while ((val = Integer.parseInt(kb.nextLine())) != 0) {
            System.out.printf("%d sayısının basamakları toplamı:%d%n", val, Util.sumDigits(val));
            System.out.print("Bir sayi giriniz: ");
        }

        System.out.printf("0 sayısının basamakları toplamı:%d%n", Util.sumDigits(val));
    }
}

class Util {
    public static int sumDigits(int val)
    {
        int sum = 0;

        while (val != 0) {
            sum += val % 10;
            val /= 10;
        }

        return Math.abs(sum);
    }
}
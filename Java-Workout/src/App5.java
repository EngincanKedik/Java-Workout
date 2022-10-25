import java.util.Scanner;

class App5 {
    public static void main(String [] args)
    {
        ReverseTest.run();
    }

}

class ReverseTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        int val;

        System.out.print("Bir sayi giriniz: ");

        while ((val = Integer.parseInt(kb.nextLine())) != 0) {
            System.out.printf("%d sayısının tersi:%d%n", val, SampleUtil.reverse(val));
            System.out.print("Bir sayi giriniz: ");
        }

        System.out.printf("0 sayısının tersi:%d%n", SampleUtil.reverse(val));
    }
}

class SampleUtil {
    public static int reverse(int val)
    {
        int result = 0;

        while (val != 0) {
            result = result * 10 + val % 10;
            val /= 10;
        }

        return result;
    }
}
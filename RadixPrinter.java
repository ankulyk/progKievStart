package progKievStart.Lesson5;

import java.util.Scanner;

public class RadixPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        String tempString = "";
        String resultString = "";

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        System.out.print("Enter radix: ");
        int radix = sc.nextInt();

        if (number < 0 || radix < 2 || radix > 10) {
            throw new IllegalArgumentException("number must be > 0 and radix must be between 2 and 10!");
        } else {
            while (number != 0) {
                result = number % radix;
                number = number / radix;
                tempString = Integer.toString(result);
                resultString = tempString + resultString;
            }
            System.out.println(resultString);
        }
    }
}

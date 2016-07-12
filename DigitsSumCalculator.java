package progKievStart.Lesson5;

import java.util.Scanner;

public class DigitsSumCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = 0;
        int result = 0;

        System.out.println("Enter from: ");
        int from = sc.nextInt();

        System.out.println("Enter to: ");
        int to = sc.nextInt();

        if (from > to) {
            throw new IllegalArgumentException("from must be > to!");
        } else {
            for (int i = from; i <= to; i++) {
                number = i;
                while (number != 0) {
                    result = result + (number % 10);
                    number = number / 10;
                }
            }
        }

        if (result < 0) {
            result = Math.abs(result);
        }
        System.out.println(result);
    }
}

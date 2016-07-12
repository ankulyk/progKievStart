package progKievStart.Lesson5;

import java.util.Scanner;

public class DigitsPrinter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tempNumber = 0;

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.print("-");
            number = Math.abs(number);
        }

        while (number != 0) {
            tempNumber = tempNumber * 10;
            tempNumber =tempNumber + number % 10;
            number = number / 10;
        }

        while (tempNumber != 0) {
            System.out.print(tempNumber % 10 + " ");
            tempNumber = tempNumber / 10;
        }
    }
}

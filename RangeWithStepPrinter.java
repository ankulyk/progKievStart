package progKievStart.Lesson4;

import java.util.Scanner;

public class RangeWithStepPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first: ");
        int first = sc.nextInt();

        System.out.print("Enter last: ");
        int last = sc.nextInt();

        System.out.print("Enter step: ");
        int step = sc.nextInt();

        if (first <= last) {
            if ( step > 0) {
                while (first <= last) {
                    System.out.print(first + " ");
                    first += step;
                }
            } else {
                throw new IllegalArgumentException("if first <= last step must be > 0");
            }
        } else {
            if (first >= last) {
                if (step < 0) {
                    while (first >= last) {
                        System.out.print(first + " ");
                        first += step;
                    }
                } else {
                    throw new IllegalArgumentException("if first >= last step must be < 0 ");
                }
            }
        }
        sc.close();
    }
}

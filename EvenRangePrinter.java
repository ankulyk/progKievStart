package progKievStart.Lesson4;

import java.util.Scanner;

public class EvenRangePrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first: ");
        int first = sc.nextInt();

        System.out.print("Enter last: ");
        int last = sc.nextInt();

        if (first < last) {
            if (first % 2 == 1) {
                for (int i = first; first < last; first ++) {
                    first ++;
                    System.out.print(first + " ");
                }
            } else {
                for (int i = first; first <= last; first += 2) {
                    System.out.print(first + " ");
                }
            }
        }
        sc.close();
    }
}

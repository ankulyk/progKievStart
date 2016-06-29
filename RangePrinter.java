package progKievStart.Lesson4;

import java.util.Scanner;

public class RangePrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first: ");
        int first = sc.nextInt();

        System.out.print("Enter last: ");
        int last = sc.nextInt();

        if (first <= last) {
            while (first <= last) {
                System.out.print(first + " ");
                first++;
            }
        } else while (first >= last) {
            System.out.print(first + " ");
            first--;
        }
        sc.close();
    }
}

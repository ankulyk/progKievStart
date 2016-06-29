package progKievStart.Lesson4;

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();
        long factorial = 1;

        if (n >= 1 && n <= 20) {
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }

        } else {
            throw new IllegalArgumentException("n must be in [1..20]");
        }
        System.out.println("Factorial: " + factorial);
        sc.close();
    }
}

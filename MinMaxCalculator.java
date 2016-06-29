import java.util.Scanner;


public class MinMaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a:");
        int a = sc.nextInt();

        System.out.print("Enter b:");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("max: " + a + " min: " + b);
        } else {
            System.out.println("max: " + b + " min: " + a);
        }
        sc.close();
    }
}

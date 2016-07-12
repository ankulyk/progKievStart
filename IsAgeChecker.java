import java.util.Scanner;

public class IsAgeChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age:");
        int age = sc.nextInt();

        boolean isAge = true;

        if (age => 1 && age <= 120) {
            System.out.println(isAge);
        } else {
            System.out.println("");
        }

        sc.close();
    }
}

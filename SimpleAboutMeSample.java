import java.util.Scanner;

public class SimpleAboutMeSample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = sc.next();

        System.out.println("Enter your surname:");
        String surname = sc.next();

        System.out.println("Enter your age:");
        int age = sc.nextInt();

        System.out.println("I'm " + name + " " + surname +", " + age + " years old" );
    }
}

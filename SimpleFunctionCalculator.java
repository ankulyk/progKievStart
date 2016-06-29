import java.util.Scanner;

public class SimpleFunctionCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x:");
        double x = sc.nextDouble();


        System.out.println( Math.log (Math.sin(x) + (Math.pow(Math.E, x) * Math.sqrt(x) )/ Math.PI ) );
    }
}

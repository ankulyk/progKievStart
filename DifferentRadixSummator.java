package progKievStart;

import java.util.Scanner;

public class DifferentRadixSummator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter X in Bin: ");
        int x = sc.nextInt(2);

        System.out.print("Enter Y in Oct: ");
        int y = sc.nextInt(8);

        System.out.print("Enter Z in Hex: ");
        int z = sc.nextInt(16);

        int result = x + y + z;

        System.out.println("x + y + z: " + result);

        sc.close();

    }
}

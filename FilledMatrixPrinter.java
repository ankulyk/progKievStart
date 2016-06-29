package progKievStart.Lesson4;

import java.util.Scanner;

public class FilledMatrixPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter cols: ");
        int cols = sc.nextInt();

        System.out.print("Enter filler: ");
        int filler = sc.nextInt();

        if (rows < 0 || cols < 0) {
            throw new IllegalArgumentException("cols and rows must be >= 0");
        } else {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(filler + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}

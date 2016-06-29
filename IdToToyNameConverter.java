package progKievStart.Lesson4;

import java.util.Scanner;

public class IdToToyNameConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter idToy from 0 to 3: ");
        int idToy = sc.nextInt();

        String getToyName;

        if (idToy == 0) {
            getToyName = "Car";
        } else if (idToy == 1) {
            getToyName = "Lego";
        } else if (idToy == 2) {
            getToyName = "Doll";
        } else if (idToy == 3) {
            getToyName = "Puzzle";
        } else {
            throw new IllegalArgumentException("idToy arg must be in rang [0..3]");
        }
        System.out.println("Toy: " + getToyName);
        sc.close();
    }
}

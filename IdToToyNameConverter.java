package progKievStart.Lesson4;

import java.util.Scanner;

public class IdToToyNameConverter {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String toyName;
        
        System.out.print("Enter idToy from 0 to 3: ");
        int idToy = sc.nextInt();

        if (idToy == 0) {
            toyName = "Car";
        } else if (idToy == 1) {
            toyName = "Lego";
        } else if (idToy == 2) {
            toyName = "Doll";
        } else if (idToy == 3) {
            toyName = "Puzzle";
        } else {
            throw new IllegalArgumentException("idToy arg must be in rang [0..3]");
        }
        System.out.println("Toy: " + toyName);
        sc.close();
    }
}

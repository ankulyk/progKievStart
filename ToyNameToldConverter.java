package progKievStart.Lesson4;

import java.util.Scanner;

public class ToyNameToldConverter {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int idToy;
        
        System.out.print("Enter toyName: ");
        String toyName = sc.nextLine();

        switch (toyName) {
            case "Car":
                idToy = 0;
                break;
            case "Lego":
                idToy = 1;
                break;
            case "Doll":
                idToy = 2;
                break;
            case "Puzzle":
                idToy = 3;
                break;
            default:
                throw new IllegalArgumentException("We don't have this toyName.");
        }
        System.out.println("idToy: " + idToy);
        sc.close();
    }
}

package progKievStart.Lesson4;

import java.util.Scanner;

public class AgeParser {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter ageString: ");
        String ageString = sc.nextLine();
        int AgeParser = Integer.parseInt(ageString);

        if (AgeParser <= 0 || AgeParser > 120){
            throw new IllegalArgumentException(" AgeParser arg must be in the range [1..120], but actually is " + AgeParser);
        } else {
            System.out.println(AgeParser);
        }
        sc.close();
    }
}

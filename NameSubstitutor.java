import java.util.Scanner;

public class NameSubstitutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter message:");
        String message = sc.nextLine();

        System.out.print("Enter name:");
        String name = sc.nextLine();

        String needChange = "${name}";

        String result = message.replace(needChange, name);

        System.out.println(result);

    }
}

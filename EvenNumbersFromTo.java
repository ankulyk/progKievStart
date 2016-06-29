package progKievStart.Lesson4;

public class EvenNumbersFromTo {
    public static void main(String[] args) {
        int from = 33, to = 50;


        if (from % 2 == 0) {
            for (int i = from; i <= 50; i += 2) {

                System.out.print(i + " ");
            }
        } else for (int i = from; i <= to; i++) {
            i++;
            System.out.print(i + " ");
        }
    }
}

package progKievStart.Lesson4;

public class NumbersBetweenFromAndTo {
    public static void main(String[] args) {
        int from = 30, to = 20;

        if (from < to) {
            for (int i = from; i <= to; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = to; i <= from; i++) {
                System.out.print(i + " ");
            }
        }
    }
}

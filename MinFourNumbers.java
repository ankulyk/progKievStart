package progKievStart.Lesson4;

public class MinFourNumbers {
    public static void main(String[] args) {
        int a = 5, b = 6, c = 7, d = 4;

        if (a < b && a < c && a < d) {
            System.out.println("Min: a=" + a);
        } else if (b < a && b < c && b < d) {
            System.out.println("Min: b=" + b);
        } else if (c < a && c < b && c < d) {
            System.out.println("Min: c=" + c);
        } else System.out.println("Min: d =" + d);
    }
}

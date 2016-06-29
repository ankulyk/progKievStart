package progKievStart.Lesson4;

public class MinThreeNumbers {
    public static void main(String[] args) {
        int a = 5, b = 7, c = 4;

        if (a < b && a < c) {
            System.out.println("Min: a=" + a);
        } else if (b < a && b < c) {
            System.out.println("Min: b=" + b);
        } else System.out.println("Min: c=" + c);
    }
}

package progKievStart.Lesson6;

public class MatrixAverageCalculator {
    public static void main(String[] args) {

        int[][] matrix = new int[][]{{0, 3, -2}, {2, 1, 3}, {-1, 5, 2}};

        double ave = calculateAverage(matrix);
        System.out.println("ave = " + ave);

    }

    public static double calculateAverage(int[][] matrix) {
        double average = 0;
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                average = (average + matrix[i][j]);
                count++;
            }
        }
        return (average / count);

    }
}

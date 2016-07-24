package progKievStart.Lesson6;

public class MatrixPrinter {
    public static void main(String[] args) {

        int[][]matrix = new int[3][4];

        printMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}

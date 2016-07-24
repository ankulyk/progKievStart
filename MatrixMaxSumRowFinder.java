package progKievStart.Lesson6;

public class MatrixMaxSumRowFinder {
    public static void main(String[] args) {

        int[][] matrix = {{0, 3, -2}, {2, 1, 3}, {-1, 5, 2}};

        int maxSumRow = findMaxSumRow(matrix);
        System.out.println("maxSumRow = " + maxSumRow);
    }

    public static int findMaxSumRow(int[][] matrix) {
        int maxSumRow = 0;
        int[] sumRow = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum = sum + matrix[i][j];

            }
            sumRow[i] = sum;
        }
        for (int i = 0; i < sumRow.length; i++) {
            if (sumRow[maxSumRow] < sumRow[i]) {
                maxSumRow = i;
            }
        }
        return maxSumRow;
    }
}


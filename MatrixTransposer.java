package progKievStart.Lesson6;

import java.util.Arrays;

public class MatrixTransposer {
    public static void main(String[] args) {

        int n = 2;
        int m = 4;
        int[][] sourceMatrix = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8}};


        int[][] transposeMatrix = transpose(sourceMatrix);
        System.out.println(Arrays.deepToString(sourceMatrix));
        System.out.println(Arrays.deepToString(transposeMatrix));
    }

    public static int[][] transpose(int[][] sourceMatrix) {
        int[][] transposeMatrix = new int[4][2];
        for (int i = 0; i < sourceMatrix.length; i++) {
            for (int j = 0; j < sourceMatrix[i].length; j++) {
                transposeMatrix[j][i] = sourceMatrix[i][j];
            }
        }
        return transposeMatrix;
    }
}

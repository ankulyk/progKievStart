package progKievStart.Lesson6;

public class IdentityMatrixChecker {
    public static void main(String[] args) {

        int n = 3;
        int m = 4;
        int[][] matrix = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        boolean result = isIdentity(matrix);
        System.out.println(result);
    }

    public static boolean isIdentity(int[][] matrix) {
        boolean result = true;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    if (matrix[i][j] != 1) {
                        result = !result;
                        break;
                    }
                } else {
                    if (i != j) {
                        if (matrix[i][j] != 0) {
                            result = !result;
                            break;
                        }
                    }
                }

            }
        }
        return result;

    }
}

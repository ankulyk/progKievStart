package progKievStart.Lesson6;

import java.util.Arrays;

public class FrequentElemFinder {
    public static void main(String[] args) {

        int[] array = new int[10];

        int result = findFrequentElem(new int[]{1, 2, -5, 4, -5, 6, 7, 8, 9, 7});
        System.out.println(result);
    }

    public static int findFrequentElem(int[] array) {
        int count = 0;
        int[][] temp = new int[2][10];
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j] == array[i]) {
                    count++;
                }
            }
            for (int m = i; m < temp[1].length; m++) {
                temp[1][m] = count;
            }
            count = 0;
        }

        temp[0] = Arrays.copyOf(array, array.length);
        int x = 0;

        for (int i = 0; i < temp[1].length; i++) {
            if (temp[1][i] > temp[1][0 + x]) {
                result = temp[0][i];
                x = i;
            } else {
                result = temp[0][0 + x];
            }
        }

        return result;
    }


}


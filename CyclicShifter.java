package progKievStart.Lesson6;

import java.util.Arrays;

public class CyclicShifter {
    public static void main(String[] args) {

        int shiftPosition = -1;
        int[] array = new int[]{0, 1, 2, 3, 4};

        cyclicShift(array, shiftPosition);

        System.out.println(Arrays.toString(array));
    }

    public static void cyclicShift(int[] array, int shiftPosition) {
        if (shiftPosition >= 0) {
            for (int i = 0; i < shiftPosition; i++) {
                int x = 0;
                x = array[array.length - 1];
                for (int j = 1; j < array.length; j++) {
                    array[array.length - j] = array[array.length - (1 + j)];
                }
                array[0] = x;
            }
        } else {
            for (int i = shiftPosition; i < 0; i++) {
                int x = 0;
                x = array[0];
                for (int j = 0; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = x;
            }
        }
    }
}

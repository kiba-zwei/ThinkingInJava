package xlab.thinkinginjava.lgorithmn;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * QuickSort
 * @author kiba
 * @since 2020/8/31
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] array = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};
        sortLeftRightPointer(array, 0, array.length - 1);
        System.out.println(Arrays.stream(array).boxed().collect(Collectors.toList()));
    }

    private static void sortLeftRightPointer(int[] array, int left, int right) {
        if (left > right) {
            return;
        }
        int base = array[left];
        int i = left;
        int j = right;
        while (i < j) {
            while (array[j] >= base && i < j) {
                j--;
            }

            while (array[i] <= base && i < j) {
                i++;
            }
            if (i < j) {
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
            }
        }

        array[left] = array[i];
        array[i] = base;

        sortLeftRightPointer(array, left, i - 1);
        sortLeftRightPointer(array, i + 1, right);
    }
}

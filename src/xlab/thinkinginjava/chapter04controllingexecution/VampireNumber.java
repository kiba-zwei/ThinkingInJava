package xlab.thinkinginjava.chapter04controllingexecution;

import java.util.ArrayList;
import java.util.List;

/**
 * 吸血鬼数字是指位数为偶数的数字，可以由一堆数字相乘而得到。而这对数字各包含乘积的一半位数的数字，其中从最初的数字中选取的数
 * 字可以任意排序。以两个0结尾的数字是不允许的，例如，下列的数字都是“吸血鬼”数字：
 * <p>
 * 1260=21*60
 * <p>
 * 1827=21*87
 * <p>
 * 2187=27*81
 * <p>
 * 写出一个程序，找出4位数的所有吸血鬼数字
 */
public class VampireNumber {
    public static void main(String[] args) {
        for (int i = 1000; i < 10000; i++) {
            int[] temp = breakUpNumber(i);
            List<String> numbers = new ArrayList<>();
            fullSort(temp, 0, temp.length - 1, numbers);
            for (String s : numbers) {
                if (isVampireNumber(i, s)) {
                    System.out.println(i + "=" + s.substring(0, 2) + "*" + s.substring(2));
                    break;
                }
            }
        }
    }

    private static boolean isVampireNumber(int ori, String num) {
        int a = Integer.valueOf(num.substring(0, 2));
        int b = Integer.valueOf(num.substring(2));
        if (ori == a * b) {
            if ((a % 10 == 0) && (b % 10 == 0)) {
                return false;
            }
            return true;
        }
        return false;
    }

    private static void fullSort(int[] arr, int start, int end, List<String> result) {
        if (start == end) {
            StringBuilder sb = new StringBuilder();
            for (int i : arr) {
                sb.append(i);
            }
            result.add(sb.toString());
            return;
        }
        for (int i = start; i <= end; i++) {
            swap(arr, i, start);
            fullSort(arr, start + 1, end, result);
            swap(arr, i, start);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    private static int[] breakUpNumber(int num) {
        String str = String.valueOf(num);
        int[] result = new int[str.length()];
        for (int i = 0; i < result.length; i++) {
            result[i] = str.charAt(i) - '0';
        }
        return result;
    }
}

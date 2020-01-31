package xlab.thinkinginjava.chapter05initialization;

import java.util.Arrays;

/**
 * @author kiba
 * @Description InitializationTest
 * @Datetime 2020/1/30 21:05
 */
public class InitializationTest {
    public static void main(String[] args) {
        EnumClass enumClass = EnumClass.TEST_2;
        System.out.println("enumClass.toString():" + enumClass.toString());
        System.out.println("enumClass.ordinal():" + enumClass.ordinal());
        System.out.println("EnumClass.TEST_1.ordinal():" + EnumClass.TEST_1.ordinal());
        System.out.println("EnumClass.valueOf(\"TEST_1\"):" + EnumClass.valueOf("TEST_1"));

        // 自动装箱
        Integer[] c = new Integer[]{1, 2};
        System.out.println(Arrays.toString(c));
    }

    enum EnumClass {TEST_1, TEST_2}
}

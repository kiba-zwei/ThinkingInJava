package xlab.thinkinginjava.chapter04controllingexecution;

import java.util.Scanner;

public class LableTest {
    private static final int BREAK = 0;
    private static final int CONTINUE = 1;
    private static final int BREAK_LABEL = 2;
    private static final int CONTINUE_LABEL = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int type = scanner.nextInt();
        System.out.println("Input is " + convert(type));
        label1:
        for (int i = 0; i < 2; i++) {
            System.out.println("outer-iteration i=" + i);
            for (int j = 0; j < 2; j++) {
                System.out.println("inner-iteration i=" + i + " j=" + j);
                if (j == 1) {
                    switch (type) {
                        case BREAK:
                            System.out.println("break");
                            break;
                        case CONTINUE:
                            System.out.println("continue");
                            continue;
                        case BREAK_LABEL:
                            System.out.println("break lable1");
                            break label1;
                        case CONTINUE_LABEL:
                            System.out.println("continue lable1");
                            continue label1;
                        default:
                            break;
                    }
                }
            }
        }
    }

    private static String convert(int type) {
        switch (type) {
            case BREAK:
                return "break";
            case CONTINUE:
                return "continue";
            case BREAK_LABEL:
                return "break lable1";
            case CONTINUE_LABEL:
                return "continue lable1";
            default:
                return "unknow";
        }
    }
}

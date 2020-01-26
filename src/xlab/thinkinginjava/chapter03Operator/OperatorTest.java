package xlab.thinkinginjava.chapter03Operator;

public class OperatorTest {
    public static void main(String[] args) {
        intergeTest();
    }

    public static void intergeTest() {
        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);
        System.out.println("n1 == n2:" + (n1 == n2)); // false
        System.out.println("n1.equals(n2):" + n1.equals(n2)); // true
        Integer n3 = 47;
        Integer n4 = 47;
        System.out.println("n3 == n4:" + (n3 == n4)); // true

        Integer n5 = 128;
        Integer n6 = 128;
        System.out.println("n5 == n6:" + (n5 == n6)); // false
    }

    public static void octonaryNumberSystem(){
        int n1 = 8;
//        int n2 = 08;
        int n3 = 07;
    }
}

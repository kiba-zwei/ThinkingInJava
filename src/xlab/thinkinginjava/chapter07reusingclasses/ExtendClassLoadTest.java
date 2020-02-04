package xlab.thinkinginjava.chapter07reusingclasses;

/**
 * ExtendClassLoadTest
 * @author kiba
 * @since 2020/2/1 
 */
public class ExtendClassLoadTest {
    public ExtendClassLoadTest() {
        System.out.println("Constructor - ExtendClassLoadTest");
        new Son();
    }

    public static void main(String[] args) {
        new ExtendClassLoadTest();
    }
}

class Father {
    public String dynmaicStr = "Father - dynmaicStr";
    public static String staticStr = "Father - staticStr";
    public int value;

    {
        System.out.println("value = " + value + " " + dynmaicStr);
    }

    static {
        System.out.println(staticStr);
    }

    public Father() {
        System.out.println("constructor Father value = " + value);
        add();
        System.out.println("constructor Father after add value = " + value);
    }

    protected void add() {
        value += 12;
    }
}

class Son extends Father {
    public String dynmaicStr = "Son - dynmaicStr";
    public static String staticStr = "Son - staticStr";

    {
        System.out.println("value = " + value + " " + dynmaicStr);
    }

    static {
        System.out.println(staticStr);
    }

    @Override
    protected void add() {
        value += 44;
    }

    public Son() {
        System.out.println("constructor Son value = " + value);
        add();
        System.out.println("constructor Son after add value = " + value);
    }
}

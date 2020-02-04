package xlab.thinkinginjava.chapter07reusingclasses;

/**
 * NoUseOverrideMethodInFatherConstructorTest
 * @author kiba
 * @since 2020/2/1 
 */
public class NoUseOverrideMethodInFatherConstructorTest {
    public static void main(String[] args) {
        Base base = new Base();
        base.printValue();

        Base sub = new Sub();
        sub.printValue();
    }
}

class Base {
    protected Integer value;

    protected void show() {
        System.out.println("Base show");
    }

    protected void add() {
    }

    public Base() {
        show();
        add();
    }

    public void printValue() {
        System.out.println("Base value = " + value);
    }
}

class Sub extends Base {
    public Sub() {
        value = new Integer(12);
    }

    @Override
    protected void add() {
        value++;
    }

    @Override
    public void printValue() {
        System.out.println("Sub value = " + value);
    }
}

package xlab.thinkinginjava.chapter07reusingclasses;

/**
 * SimpleClassLoadTest
 * @author kiba
 * @since 2020/2/1 
 */
public class SimpleClassLoadTest {
    public Test testDynamic = new Test("Dynamic");
    public static Test testStatic = new Test("Static");

    public static void main(String[] args) {
        System.out.println("Run into mian");
        new SimpleClassLoadTest();
    }

    {
        System.out.println("Code block");
    }

    static {
        System.out.println("Static code block");
    }

    public static Test testStaticSecond = new Test("Static Second");


    public SimpleClassLoadTest() {
        System.out.println("Constructor SimpleClassLoadTest");
    }
}

class Test {
    public Test(String flag) {
        System.out.println("Constructor Test flag: " + flag);
    }
}

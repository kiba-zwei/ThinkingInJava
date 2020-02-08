package xlab.thinkinginjava.chapter08polymorphism;

/**
 * PolymorphismTest
 * @author kiba
 * @since 2020/2/8 
 */
public class PolymorphismTest {
    public static void main(String[] args) {
        Base derived = new Derived();
        Derived derived1 = (Derived) derived;
        System.out.println("field - derived.value:" + derived.value);
        System.out.println("method - derived.getValue():" + derived.getValue());
        System.out.println("field - derived1.value:" + derived1.value);
        System.out.println("method - derived1.getValue():" + derived1.getValue());
        System.out.println("Base static method - Base.getString():" + Base.getString());
        System.out.println("Derived static method - derived.getString():" + Derived.getString());
    }
}

class Base {
    public int value = 0;

    public static String getString() {
        return "Base";
    }

    public int getValue() {
        return value;
    }
}

class Derived extends Base {
    public int value = 1;

    // @Override 静态方法关联的是类，无所谓多态性，这块写override会报编译错误
    public static String getString() {
        return "Derived";
    }

    @Override
    public int getValue() {
        return value;
    }
}

class A {
    public C method() {
        return new C();
    }
}

class B extends A {
    @Override
    public D method() {
        return new D();
    }
}

class C {

}

class D extends C {

}
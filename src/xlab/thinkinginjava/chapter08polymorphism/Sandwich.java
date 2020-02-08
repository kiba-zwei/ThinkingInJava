package xlab.thinkinginjava.chapter08polymorphism;

/**
 * Sandwich
 * @author kiba
 * @since 2020/2/8 
 */
public class Sandwich extends PortableLunch {
    private Bread bread = new Bread();
    private Cheese cheese = new Cheese();
    private Lettuce lettuce = new Lettuce();

    public static void main(String[] args) {
        new Sandwich();
    }

    public Sandwich() {
        System.out.println("SanWich()");
    }
}

class Meal {
    Meal() {
        System.out.println("Meal()");
    }
}

class Bread {
    Bread() {
        System.out.println("Bread()");
    }
}

class Cheese {
    Cheese() {
        System.out.println("Cheese()");
    }
}

class Lettuce {
    Lettuce() {
        System.out.println("Lettuce()");
    }
}

class Lunch extends Meal {
    Lunch() {
        System.out.println("Lunch()");
    }
}

class PortableLunch extends Lunch {
    PortableLunch() {
        System.out.println("PortableLunch()");
    }
}
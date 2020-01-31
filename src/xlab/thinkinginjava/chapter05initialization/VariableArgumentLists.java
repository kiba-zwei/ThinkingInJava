package xlab.thinkinginjava.chapter05initialization;

/**
 * VariableArgumentLists
 *
 * @author kiba
 * @since 2020/1/31
 */
public class VariableArgumentLists {
    public static void main(String[] args) {
        f(1, 'a');
        f('a', 'b');
    }

    static void f(float i, Character... args) {
        System.out.println("first");
    }

    static void f(Character... args) {
        System.out.println("second");
    }

}

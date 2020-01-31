package xlab.thinkinginjava.chapter03operator;

public class TestStringEquals {
    public static void main(String[] args) {
        String str1 = "string";
        String str2 = "str" + "ing";
        String str3 = new String("string");
        String ste41 = "str";
        String str42 = "ing";
        String str4 = ste41 + str42;
        System.out.println("str1==str2:" + (str1 == str2));// true
        System.out.println("str1==str3:" + (str1 == str3));// false
        System.out.println("str1.equals(str3):" + str1.equals(str3));// true
        System.out.println("str1==str4:" + (str1 == str4));// false
    }
}

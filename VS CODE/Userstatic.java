public class Userstatic{
    static int a = 3;
    static int b;
    static {
        System.out.println("static block initialized");
        b = a * 4;
        System.out.println("b=" + b);
    }
    static void math(int x) {
        System.out.println("x=" + x);
        System.out.println("a=" + a);
    }
    public static void main(String[] args) {
        Userstatic.math(42);
    }
}
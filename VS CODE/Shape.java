import java.util.*;
public class Shape{
    int a;
    int b;
    public Shape(int a,int b){
        this.a=a;
        this.b=b;
    }
    public void setValue(int a, int b){
        this.a=a;
        this.b=b;
    }
    public void Display(){
        System.out.println("value of a ="+a+"value of b ="+b);
    }

}
public class Main{
    public static void main(String args[]){
        Shape S1 = new Shape();
        Shape S2 = new Shape();
        S1.setValue(3,5);
        S2.setValue(6,7);
        S1.Display();
        S2.Display();
        System.out.println("Before scenario");
        System.out.println("address of s1 = "+S1.hashCode);
        System.out.println("address of s2 = "+S2.hashCode);
        s1=s2;
        System.out.println("After scenario");
        System.out.println("address of s1 = "+S1.hashCode);
        System.out.println("address of s2 = "+S2.hashCode);
    }
}
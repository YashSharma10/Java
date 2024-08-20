import java.util.*;
public class salarydiscount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the quantity");
        int a = sc.nextInt();
        int b = a*100;
        int c = b+a/20;
        if(a>5){
            System.out.println("cost = "+c);
        }
        else{
            System.out.println("cost ="+b);
        }
    }
}
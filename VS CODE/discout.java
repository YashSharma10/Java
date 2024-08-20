import java.util.*;
public class discout {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the quantity");
        int a = sc.nextInt();
        int b = a*100;
        int c = b-a/10;
        if(a>1000){
            System.out.println("cost = "+b);
        }
        else{
            System.out.println("cost ="+c);
        }
    }
}

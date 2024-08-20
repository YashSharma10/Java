import java.util.*;
public class checksquare {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length");
        int a = sc.nextInt();
        System.out.println("Enter bredth");
        int b = sc.nextInt();
        if(a==b){
            System.out.println("its a square");
        }
        else{
            System.out.println("its not a square");
        }

    }
}

import java.util.*;
public class GreatestNumber {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter 1st number ");
    int a = sc.nextInt();
    System.out.println("enter 2nd number ");
    int b =sc.nextInt();
    if(a>b){
        System.out.println("1st number is biggest");
    }
    else{
        System.out.println("2nd number is greatest");
    }

   }
}

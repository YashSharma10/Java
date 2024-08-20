import java.util.*;
public class array4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int sum=0;
        System.out.println("Enter elements of array :");
        int i;
        for(i=1;i<=5;i++){
            a[i]=sc.nextInt();
        }
        for(i=1;i<=5;i++){
            sum=sum+a[i];
        }
        System.out.println("sum = "+sum);
    }
    
}

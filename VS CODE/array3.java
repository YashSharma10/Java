import java.util.*;
public class array3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int even_count=0;
        int odd_count=0;
        int i;
        System.out.println("enter elements ");
        for(i=1;i<=5;i++){
            a[i]=sc.nextInt();
        }
        for(i=1;i<=5;i++){
            if(a[i]%2==0){
            even_count++;
            }
            else{
            odd_count++;
            }
        }
        System.out.println("even elements : "+even_count);
        System.out.println("odd elements : "+odd_count);
    }
    }

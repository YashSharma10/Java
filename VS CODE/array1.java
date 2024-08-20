import java.util.Scanner;
public class array1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        System.out.println("Enter elements of array :");
        int i;
        for(i=1;i<=5;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("array elements are :");
        for(i=1;i<=5;i++){
            System.out.println(a[i]);
        }
    }
}

package Array;
import java.util.*;
public class Sorting {
    public static void main(String args[]){
        int a[] = new int[] {3,11,9,6,7,8,5,67,55};
        System.out.println("elements before sort are :");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        Arrays.sort(a);
        System.out.println("elements after sort are ");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}


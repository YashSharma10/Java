import java.util.*;
public class jagged_array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][];
         a[0] = new int[3];
         a[1] = new int[2];
         a[2] = new int[4];
        int r,c;
        for(r=0;r<3;r++){
            for(c=0;c<a[r].length;c++){
                a[r][c] = sc.nextInt();
            }
        }
        for(r=0;r<3;r++){
            for(c=0;c<a[r].length;c++){
                System.out.println(a[r][c]);
            }
        }

    }
}

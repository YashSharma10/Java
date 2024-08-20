import java.util.*;
public class sum_of_array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] c = new int[3][3];
        int r,c;
        System.out.println("Enter elements of matrix 1 :");
        for(r=0;r<3;r++){
            for(c=0;c<3;c++){
                a[r][c] = sc.nextInt();
            }
        }
        System.out.println("elements of matrix 1 are :");
        for(r=0;r<3;r++){
            for(c=0;c<3;c++){
                System.out.println(a[r][c]);
            }
            System.out.println();
        }
        int i,j;
        System.out.println("Enter elements of matrix 2 :");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("elements of matrix 2 are :");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.println(b[i][j]);
            }
            System.out.println();
        }
        System.out.println("elements of matrix 2 are :");
        int x,y;
        for(x=0;x<3;x++){
            for(y=0;y<3;y++){
                c[x][y]=a[r][c]+b[i][j];
            }
        }
    for(x=0;x<3;x++){
        for(y=0;y<3;y++){
            System.out.println(c[x][y]);
        }
    }
    System.out.println();  
}
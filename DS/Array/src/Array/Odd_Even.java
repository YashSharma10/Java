package Array;
import java.util.*;
public class Odd_Even {
	public static void main(String args[]) {
		Random rand = new Random(100);
		Scanner sc = new Scanner(System.in);
		int[] arg = new int[1000000];
		System.out.println("Enter the number of elemennts : ");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            arg[i] = rand.nextInt(100);
        }
        System.out.println("elemennts : ");
        for (int i = 0; i < n; i++) {
            System.out.println(arg[i]);
        }
        
        int even = arg[0];
        int odd = arg[0];
        
        int ecount=0;
        int ocount=0;
        
        long startTime = System.nanoTime();
        for (int i = 0; i < n; i++)
        {
        	if(arg[i]%2==0)
        	{
        		ecount++;
        		
        	}
        }
        System.out.println("even element in the array are : "+ ecount);
        for (int i = 0; i < n; i++)
        {
        	if(arg[i]%2!=0)
        	{
        		ocount++;
        		
        	}
        }
        System.out.println("odd element in the array are : "+ ocount);
        System.out.println("reverse elemennts : ");
        for (int i = n-1; i >=0; i--) {
            System.out.println(arg[i]);
        }
        
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println("Time elapsed: " + timeElapsed + " nanoseconds");

	}
}

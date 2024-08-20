package Arrays;

public class MaxMin {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		
		System.out.print(findSum(a,5));
	}
	public static int findSum(int A[],int N) 
	  {
	      
	      int min=Integer.MAX_VALUE;
	      int max =Integer.MIN_VALUE;
	      
	      for(int i=0;i<N;i++){
	          if(A[i]>max){
	              max=A[i];
	          }
	      }
	      for(int i=0;i<N;i++){
	          if(A[i]<min){
	              min=A[i];
	          }
	      }
	      int sum =max+min;
	      return sum;
	      
	  }
}


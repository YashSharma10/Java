package Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        Reverse(a);
    }

    static void Reverse(int[] a) {
        int n = a.length;
        int ei = n - 1;
        int si = 0;

        while (si < ei) {
            
            int temp = a[si];
            a[si] = a[ei];
            a[ei] = temp;

            
            si++;
            ei--;
        }

        
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

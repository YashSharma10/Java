package Arrays;

public class DuplicateValueInArray {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        @SuppressWarnings("unused")
		int[] b = {1, 2, 3, 2, 5};
        System.out.println(hasDuplicate(a));
    }

    static boolean hasDuplicate(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}

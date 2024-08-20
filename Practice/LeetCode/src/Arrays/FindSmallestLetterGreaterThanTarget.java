//You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.
//
//Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.
//
// 
//
//Example 1:
//
//Input: letters = ["c","f","j"], target = "a"
//Output: "c"
//Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.
//Example 2:
//
//Input: letters = ["c","f","j"], target = "c"
//Output: "f"
//Explanation: The smallest character that is lexicographically greater than 'c' in letters is 'f'.
//Example 3:
//
//Input: letters = ["x","x","y","y"], target = "z"
//Output: "x"
//Explanation: There are no characters in letters that is lexicographically greater than 'z' so we return letters[0].
// 
//
//Constraints:
//
//2 <= letters.length <= 104
//letters[i] is a lowercase English letter.
//letters is sorted in non-decreasing order.
//letters contains at least two different characters.
//target is a lowercase English letter.

package Arrays;

public class FindSmallestLetterGreaterThanTarget {

    public static void main(String[] args) {
        char[] letters1 = {'c', 'f', 'j'};
        char target1 = 'a';
        System.out.println(find(letters1, target1)); // Output: c

        char[] letters2 = {'c', 'f', 'j'};
        char target2 = 'c';
        System.out.println(find(letters2, target2)); // Output: f

        char[] letters3 = {'x', 'x', 'y', 'y'};
        char target3 = 'z';
        System.out.println(find(letters3, target3)); // Output: x
    }

    static char find(char[] a, char b) {
        int start = 0;
        int end = a.length - 1;
        char result = a[0]; // Initialize result with the first character

        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (a[mid] > b) {
                result = a[mid]; // Update result with the current character
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return result;
    }
}

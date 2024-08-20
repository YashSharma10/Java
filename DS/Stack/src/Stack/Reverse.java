package Stack;
import java.util.Stack;

public class Reverse {
    public static String reverseSentence(String str) {
        // Split the sentence into words
        String[] words = str.split(" ");

        // Create a stack to store words
        Stack<String> stack = new Stack<>();

        // Push words onto the stack
        for (String word : words) {
            stack.push(word);
        }

        // Pop words from the stack to form the reversed sentence
        StringBuilder reversedSentence = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedSentence.append(stack.pop()).append(" ");
        }

        return reversedSentence.toString().trim(); // Trim to remove trailing space
    }

    public static void main(String[] args) {
        // Example usage
        String inputSentence = ("data structures and algorithms");
        String reversedSentence = reverseSentence(inputSentence);

        // Output
        System.out.println("Original Sentence: " + inputSentence);
        System.out.println("Reversed Sentence: " + reversedSentence);
    }
}

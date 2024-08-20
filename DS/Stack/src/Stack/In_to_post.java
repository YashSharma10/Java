package Stack;
import java.util.Stack;
public class In_to_post {
    public static String infixToPostfix(String infix) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        // Define operator precedence
        int precedence = 0;
        for (int i = 0; i < infix.length(); i++) {
            char current = infix.charAt(i);
            if (Character.isLetterOrDigit(current)) {
                // Operand, add to the output
                postfix.append(current);
            } else if (current == '(') {
                // Left parenthesis, push to stack
                stack.push(current);
            } else if (current == ')') {
                // Right parenthesis, pop from stack and append to output until a '(' is encountered
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                if (!stack.isEmpty() && stack.peek() != '(') {
                    return "Invalid Expression"; // Unmatched parentheses
                } else {
                    stack.pop(); // Pop the '('
                }
            } else {
                // Operator, determine precedence and handle accordingly
                switch (current) {
                    case '+':
                    case '-':
                        precedence = 1;
                        break;
                    case '*':
                    case '/':
                        precedence = 2;
                        break;
                }
                while (!stack.isEmpty() && precedence <= getOperatorPrecedence(stack.peek())) {
                    postfix.append(stack.pop());
                }
                stack.push(current);
            }
        }

        // Pop any remaining operators from the stack and append to output
        while (!stack.isEmpty()) {
            if (stack.peek() == '(') {
                return "Invalid Expression"; // Unmatched parentheses
            }
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }

    private static int getOperatorPrecedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return 0; // Lower precedence for unknown operators
        }
    }

    public static void main(String[] args) {
        String infixExpression = "(a+b)*c";
        String postfixExpression = infixToPostfix(infixExpression);
        System.out.println("Infix Expression: " + infixExpression);
        System.out.println("Postfix Expression: " + postfixExpression);
    }
}
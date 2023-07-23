import java.util.Stack;

public class Soal3 {
    public static void main(String[] args) {
        String input1 = "{[()]}";
        String input2 = "{[()]})";
        String input3 = "{(([])[])[]}";

        System.out.println("Sample 1: " + isBalanced(input1)); // Output: YES
        System.out.println("Sample 2: " + isBalanced(input2)); // Output: NO
        System.out.println("Sample 3: " + isBalanced(input3)); // Output: YES
    }

    public static String isBalanced(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return "NO";
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                    return "NO";
                }
            }
        }

        return stack.isEmpty() ? "YES" : "NO";
    }
}

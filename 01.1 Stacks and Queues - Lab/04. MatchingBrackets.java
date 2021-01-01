import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        String expression = scanner.nextLine();

        for (int index = 0; index < expression.length(); index++) {
            char symbol = expression.charAt(index);

            if (symbol == '(') {
                stack.push(index);
            } else if (symbol == ')') {
                int startIndex = stack.pop();
                String sub = expression.substring(startIndex, index + 1);
                System.out.println(sub);
            }
        }
    }
}

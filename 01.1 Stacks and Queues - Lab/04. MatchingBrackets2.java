import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        String str = scan.nextLine();

        char[] line = str.toCharArray();
        int index = 0;

        for (char c : line) {
            if (c == '(') {
                stack.push(index);
            } else if (c == ')') {
                int startIndex = stack.pop();
                String part = str.substring(startIndex, index + 1);
                System.out.println(part);
            }

            index++;
        }
    }
}

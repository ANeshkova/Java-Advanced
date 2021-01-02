import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Deque<String> forward = new ArrayDeque<>();
        Deque<String> stack = new ArrayDeque<>();

        String input = scan.nextLine();

        while (!"Home".equals(input)) {

            if ("back".equals(input)) {
                if (stack.size() < 2) {
                    System.out.println("no previous URLs");
                } else {
                    forward.addFirst(stack.peek());
                    stack.pop();
                    System.out.println(stack.peek());
                }

            } else if ("forward".equals(input)) {
                if (forward.size() < 1) {
                    System.out.println("no next URLs");
                } else {
                    System.out.println(forward.peek());
                    stack.push(forward.pop());
                }

            } else {
                System.out.println(input);
                stack.push(input);
                forward.clear();
            }

            input = scan.nextLine();
        }
    }
}

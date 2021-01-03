import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpgrade2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<String> stack = new ArrayDeque<>();
        ArrayDeque<String> forwardStack = new ArrayDeque<>();

        String command = scan.nextLine();

        while (!command.equals("Home")) {

            if ("back".equals(command)) {
                if (stack.size() > 1) {
                    forwardStack.push(stack.pop());
                    System.out.println(stack.peek());
                } else {
                    System.out.println("no previous URLs");
                }

            } else if ("forward".equals(command)) {
                if (forwardStack.size() == 0) {
                    System.out.println("no next URLs");
                } else {
                    stack.push(forwardStack.peek());
                    System.out.println(forwardStack.pop());
                }

            } else {
                forwardStack.clear();
                System.out.println(command);
                stack.push(command);
            }

            command = scan.nextLine();
        }
    }
}

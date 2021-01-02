import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<String> stack = new ArrayDeque<>();
        String command = scan.nextLine();

        while (!command.equals("Home")) {

            if (command.equals("back")) {
                if (stack.size() > 1) {
                    stack.pop();
                    System.out.println(stack.peek());
                } else {
                    System.out.println("no previous URLs");
                }
            } else {
                System.out.println(command);
                stack.push(command);
            }

            command = scan.nextLine();
        }
    }
}

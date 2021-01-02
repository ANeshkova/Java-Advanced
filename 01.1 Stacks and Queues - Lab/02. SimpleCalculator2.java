import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleCalculator2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<String> deque = new ArrayDeque<>();
        String[] numbers = scan.nextLine().split(" ");

        for (String number : numbers) {
            deque.offer(number);
        }

        int result = Integer.parseInt(deque.poll());

        while (deque.size() > 0) {

            String operator = deque.poll();
            int secondNum = Integer.parseInt(deque.poll());

            if (operator.equals("+")) {
                result += secondNum;
            } else if (operator.equals("-")) {
                result -= secondNum;
            }
        }

        System.out.println(result);
    }
}

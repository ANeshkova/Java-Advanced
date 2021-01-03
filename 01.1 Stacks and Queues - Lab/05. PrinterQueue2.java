import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<String> queue = new ArrayDeque<>();
        String command = scan.nextLine();

        while (!"print".equals(command)) {

            if ("cancel".equals(command)) {
                if (queue.size() == 0) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled " + queue.poll());
                }
            } else {
                queue.offer(command);
            }

            command = scan.nextLine();
        }

        while (queue.size() != 0) {
            System.out.println(queue.poll());
        }
    }
}

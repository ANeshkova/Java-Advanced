import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<String> queueFileNames = new ArrayDeque<>();
        String input = scan.nextLine();

        while (!"print".equals(input)) {

            if (!"cancel".equals(input)) {
                queueFileNames.offer(input);
            } else {
                if (queueFileNames.size() > 0) {
                    System.out.println("Canceled " + queueFileNames.pollFirst());
                } else {
                    System.out.println("Printer is on standby");
                }
            }

            input = scan.nextLine();
        }

        if (queueFileNames.size() > 0) {
            for (String queueFileName : queueFileNames) {
                System.out.println(queueFileName);
            }
        }
    }
}

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] children = scan.nextLine().split("\\s+");
        int n = Integer.parseInt(scan.nextLine());

        ArrayDeque<String> queue = new ArrayDeque<>();
        Collections.addAll(queue, children);

        while (queue.size() > 1) {
            for (int i = 1; i < n; i++) {
                String firstChild = queue.poll();
                assert firstChild != null;
                queue.offer(firstChild);
            }

            System.out.println("Removed " + queue.pop());
        }

        System.out.println("Last is " + queue.pop());
    }
}

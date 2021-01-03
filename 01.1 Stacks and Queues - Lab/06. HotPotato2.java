import java.util.ArrayDeque;
import java.util.Scanner;

public class HotPotato2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<String> names = new ArrayDeque<>();

        String[] children = scan.nextLine().split(" ");
        int num = Integer.parseInt(scan.nextLine());

        for (String child : children) {
            names.offer(child);
        }

        int count = 1;

        while (names.size() != 1) {
            if (count == num) {
                System.out.println("Removed " + names.poll());
                count = 0;
            } else {
                String child = names.poll();
                names.offer(child);
            }

            count++;
        }

        System.out.println("Last is " + names.poll());
    }
}

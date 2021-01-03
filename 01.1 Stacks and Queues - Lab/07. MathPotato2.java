import java.util.ArrayDeque;
import java.util.Scanner;

public class MathPotato2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<String> names = new ArrayDeque<>();

        String[] children = scan.nextLine().split(" ");
        int num = Integer.parseInt(scan.nextLine());

        for (String child : children) {
            names.offer(child);
        }

        int count = 1;
        int prime = 0;
        boolean isPrime = true;

        while (names.size() != 1) {

            if (count == num) {
                prime++;

                if (prime == 1) {
                    isPrime = false;
                } else if (prime == 2 || prime == 3) {
                    isPrime = true;
                } else {
                    for (int i = 2; i <= prime / 2; i++) {

                        if (prime % i == 0) {
                            isPrime = false;
                            break;
                        } else {
                            isPrime = true;
                        }
                    }
                }

                if (isPrime) {
                    System.out.println("Prime " + names.peek());
                } else {
                    System.out.println("Removed " + names.poll());
                }

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

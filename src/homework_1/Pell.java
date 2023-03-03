package homework_1;

import java.util.Scanner;

public class Pell {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();

            if (n == 0) {
                System.out.println(0);
            } else if (n > 0 && n <= 30) {
                int[] arr = new int[n + 1];
                arr[0] = 0;
                arr[1] = 1;

                for (int i = 2; i < n + 1; i++) {
                    arr[i] = 2 * arr[i - 1] + arr[i - 2];
                }
                System.out.println(arr[n]);
            }
        }
    }
}

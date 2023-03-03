package homework_1;

import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        int number = new Random().nextInt(100);
        int maxAttempts = 10;
        int winAttempts = 1;
        System.out.println("Я загадал число от 1 до 99. У тебя " + maxAttempts + " попыток угадать.");

        try (Scanner scanner = new Scanner(System.in)) {
            while (maxAttempts > 0) {
                int myNumber = scanner.nextInt();

                if (number < myNumber) {
                    maxAttempts--;
                    winAttempts++;
                    System.out.println("Моё число меньше! Осталось " + maxAttempts + " попыток");
                } else if (number > myNumber) {
                    maxAttempts--;
                    winAttempts++;
                    System.out.println("Моё число больше! Осталось " + maxAttempts + " попыток");
                } else {
                    System.out.println("Ты угадал с " + winAttempts + " попытки");
                    break;
                }
            }
            if (maxAttempts <= 0) {
                System.out.println("Ты не угадал");
            }
        }
    }
}

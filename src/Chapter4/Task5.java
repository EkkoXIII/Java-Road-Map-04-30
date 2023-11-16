package Chapter4;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        while (a != 1) {
            a = scanner.nextInt();
            System.out.println("Не угадал!");
        }

        scanner.close();

    }
}

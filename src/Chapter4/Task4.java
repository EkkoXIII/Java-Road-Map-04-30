package Chapter4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int a = scanner.nextInt();

        scanner.close();

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Число1 + Число2 = " + (i + a));
            } else {
                System.out.println("Число1 - Число2 = " + (i - a));
            }

            if (a == i) {
                System.out.println("Числа равны!");
            }
        }
    }
}

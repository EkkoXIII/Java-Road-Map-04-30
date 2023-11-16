package Chapter2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¬ведите первое число: ");
        int a = scanner.nextInt();

        System.out.print("¬ведите первое число: ");
        int b = scanner.nextInt();

        scanner.close();

        System.out.println("–езультат сравнени€ a3 > b2, где a3 - a в кубе, b2 - b  в квадрате: "+(Math.pow(a,3)>Math.pow(b,2)));
    }
}

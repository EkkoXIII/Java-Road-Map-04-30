package Chapter2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("������� ������ �����: ");
        double a = scanner.nextDouble();

        System.out.print("������� ������ �����: ");
        double b = scanner.nextDouble();

        scanner.close();

        System.out.println("��������� c = b*a*(a + b)/(a^2): "+b*a*(a + b)/Math.pow(2,2));

    }
}

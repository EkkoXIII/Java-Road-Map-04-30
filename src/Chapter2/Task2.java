package Chapter2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("������� ������ �����: ");
        int a = scanner.nextInt();

        System.out.print("������� ������ �����: ");
        int b = scanner.nextInt();

        scanner.close();

        System.out.println("��������� ��������� a3 > b2, ��� a3 - a � ����, b2 - b  � ��������: "+(Math.pow(a,3)>Math.pow(b,2)));
    }
}

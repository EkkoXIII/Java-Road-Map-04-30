package Chapter3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("������� ���� �������: ");
        String surname = scanner.nextLine();
        System.out.print("������� ���� ���: ");
        String name = scanner.nextLine();
        System.out.print("������� ���� ��������: ");
        String middleName = scanner.nextLine();

        scanner.close();

        System.out.println("���� ���: " + surname + " " + name + " " + middleName);
        System.out.printf("���� ���: %s %s %s", surname, name, middleName);
    }
}

package Chapter3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите свою фамилию: ");
        String surname = scanner.nextLine();
        System.out.print("Введите свое имя: ");
        String name = scanner.nextLine();
        System.out.print("Введите свое отчество: ");
        String middleName = scanner.nextLine();

        scanner.close();

        System.out.println("Ваше ФИО: " + surname + " " + name + " " + middleName);
        System.out.printf("Ваше ФИО: %s %s %s", surname, name, middleName);
    }
}

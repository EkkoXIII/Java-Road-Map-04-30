package Chapter3;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("������� ������ �����: ");
        int a = scanner.nextInt();
        System.out.print("������� ������ �����: ");
        int b = scanner.nextInt();

        scanner.close();

        if (a%2==0){
            System.out.println("������ ����� ������! ������ ������������ ���� �����: �����1 * �����2 = : "+(a*b));
        }
        else {
            System.out.println("������ ����� ��������! ������ ������� ���� �����: �����1 / �����2 = : "+((double)a / (double)b));
        }

        if (a==b){
            System.out.println("����� �����!");
        }
    }
}

package Chapter3;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        scanner.close();

        if (a%2==0){
            System.out.println("Первое число четное! Выводм произведение двух чисел: Число1 * Число2 = : "+(a*b));
        }
        else {
            System.out.println("Первое число нечетное! Выводм частное двух чисел: Число1 / Число2 = : "+((double)a / (double)b));
        }

        if (a==b){
            System.out.println("Числа равны!");
        }
    }
}

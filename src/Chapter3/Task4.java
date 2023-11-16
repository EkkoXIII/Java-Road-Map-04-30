package Chapter3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();

        System.out.print("Введите второе чилсло: ");
        int b = scanner.nextInt();

        if (a % 2 == 0) {
            if (a > b) {
                System.out.println("Первое число больше второго");
            } else {
                System.out.println("Второе число больше первого");
            }

            if (a % 3 == 0) {
                if ((Math.pow(a,b)<Integer.MIN_VALUE)||(Math.pow(a,b)>Integer.MAX_VALUE)){
                    System.out.println("Результат выражения слишком большой!");
                }
                else {
                    System.out.println("Первое число в степени второе число: "+(int)Math.pow(a,b));
                }
            }
        } else {
            if (b%3 == 0){
                if (a > b) {
                    System.out.println("Первое число больше второго");
                } else {
                    System.out.println("Второе число больше первого");
                }
            }
        }
    }
}

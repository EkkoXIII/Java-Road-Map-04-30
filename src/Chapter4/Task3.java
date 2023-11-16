package Chapter4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину прямоугольника ");
        int a = scanner.nextInt();

        System.out.print("Введите ширину прямоугольника ");
        int b = scanner.nextInt();

        scanner.close();

        for (int i=1;i<=b;i++){
            for (int j=1;j<=a;j++){
                if ((i==1)||(i==b)){
                    if ((j==1)||(j==a)){
                        System.out.print(" ");
                    } else {
                        System.out.print("-");
                    }
                } else {
                    if ((j==1)||(j==a)){
                        System.out.print("|");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}

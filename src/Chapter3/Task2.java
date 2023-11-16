package Chapter3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¬ведите сообщение: ");
        String message = scanner.nextLine();

        scanner.close();

        if (message.equals("Hi")) {
            System.out.println("Hello");
        }
        else{
            if (message.equals("Bye")) {
                System.out.println("Good bye");
            }
            else {
                if (message.equals("How are you")){
                    System.out.println("How are your doing");
                }
                else {
                    System.out.println("Unknown message");
                }
            }
        }

        switch (message){
            case "Hi": System.out.println("Hello"); break;
            case "Bye": System.out.println("Good bye"); break;
            case "How are you": System.out.println("How are your doing"); break;
            default: System.out.println("Unknown message");
        }

        switch (message) {
            case "Hi" -> System.out.println("Hello");
            case "Bye" -> System.out.println("Good bye");
            case "How are you" -> System.out.println("How are your doing");
            default -> System.out.println("Unknown message");
        }

    }

}

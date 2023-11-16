package Chapter5;

public class Task1 {
    public static void main(String[] args) {
        char[] nameChars = {'Н','и','к','и','т','а'};

        System.out.println("Вариант 1:");
        for (char nameChar : nameChars) {
            System.out.print(nameChar);
        }

        System.out.println("\nВариант 2");
        String name="";
        for (char nameChar : nameChars) {
            name += nameChar;
        }
        System.out.println(name);
    }
}

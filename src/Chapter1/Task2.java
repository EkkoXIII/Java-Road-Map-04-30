package Chapter1;

public class Task2 {
    public static void main(String[] args) {
        String stringName = "Никита";
        char n = 'Н', i = 'и', k = 'к', l = 'и', t = 'т', a = 'а';
        char charName = 'Н';

        System.out.println("Вывод через String: "+stringName);
        System.out.print("Вывод через String без перехода на новую строку: "+stringName+"\n");

        System.out.println("Вывод через несколько char: "+n+i+k+l+t+a);
        System.out.print("Вывод через несколько char без перехода на новую строку: "+n+i+k+l+t+a+"\n");

        System.out.println("Вывод через один char: "+charName);
        charName ='и';
        System.out.println(charName);
        charName ='к';
        System.out.println(charName);
        charName ='и';
        System.out.println(charName);
        charName ='т';
        System.out.println(charName);
        charName ='а';
        System.out.println(charName+"\n");

        charName = 'Н';
        System.out.print("Вывод через один char без перехода на новую строку: "+charName);
        charName ='и';
        System.out.print(charName);
        charName ='к';
        System.out.print(charName);
        charName ='и';
        System.out.print(charName);
        charName ='т';
        System.out.print(charName);
        charName ='а';
        System.out.print(charName);
        System.out.println();

        System.out.print("Вывод через String: "+"\n");
        for (i=0;i<stringName.toCharArray().length;i++) {
            System.out.print(stringName.toCharArray()[i]+"\n");
        }

        System.out.print("Вывод через несколько char: \n"+n+"\n"+i+"\n"+k+"\n"+l+"\n"+t+"\n"+a+"\n");
    }
}

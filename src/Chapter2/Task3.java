package Chapter2;

public class Task3 {
    public static void main(String[] args) {

        int a = 1;

        int b = a++; // b=1, a=2
        System.out.println(a);
        System.out.println(b);
        b += a++; //b= 1 + 2, затем a++

        System.out.println(b);
        System.out.println(a);

    }
}

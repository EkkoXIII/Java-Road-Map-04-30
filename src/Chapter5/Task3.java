package Chapter5;

public class Task3 {
    public static void main(String[] args) {
        int[] simpleIntegers = new int[10];
        int integer = 2;

        for (int i = 0; i < simpleIntegers.length; i++) {
            boolean mod = false;
            for (int j = 2; j < integer; j++) {
                if (integer % j == 0) {
                    mod = true;
                    break;
                }
            }
            if (mod) {
                integer++;
                i--;
            } else {
                simpleIntegers[i] = integer;
                integer++;
            }
        }

        for (int simpleInteger : simpleIntegers) {
            System.out.println(simpleInteger + " ");

        }
    }


}

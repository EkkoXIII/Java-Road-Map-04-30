package Chapter1;

public class Task2 {
    public static void main(String[] args) {
        String stringName = "������";
        char n = '�', i = '�', k = '�', l = '�', t = '�', a = '�';
        char charName = '�';

        System.out.println("����� ����� String: "+stringName);
        System.out.print("����� ����� String ��� �������� �� ����� ������: "+stringName+"\n");

        System.out.println("����� ����� ��������� char: "+n+i+k+l+t+a);
        System.out.print("����� ����� ��������� char ��� �������� �� ����� ������: "+n+i+k+l+t+a+"\n");

        System.out.println("����� ����� ���� char: "+charName);
        charName ='�';
        System.out.println(charName);
        charName ='�';
        System.out.println(charName);
        charName ='�';
        System.out.println(charName);
        charName ='�';
        System.out.println(charName);
        charName ='�';
        System.out.println(charName+"\n");

        charName = '�';
        System.out.print("����� ����� ���� char ��� �������� �� ����� ������: "+charName);
        charName ='�';
        System.out.print(charName);
        charName ='�';
        System.out.print(charName);
        charName ='�';
        System.out.print(charName);
        charName ='�';
        System.out.print(charName);
        charName ='�';
        System.out.print(charName);
        System.out.println();

        System.out.print("����� ����� String: "+"\n");
        for (i=0;i<stringName.toCharArray().length;i++) {
            System.out.print(stringName.toCharArray()[i]+"\n");
        }

        System.out.print("����� ����� ��������� char: \n"+n+"\n"+i+"\n"+k+"\n"+l+"\n"+t+"\n"+a+"\n");
    }
}

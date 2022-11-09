import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String myName;
        final int NUM = 20;
        String word = "Begimai";
        myName = word + " is " + NUM + " years old";
        System.out.println(myName);

        String allVariables = word + NUM + myName;
        System.out.println(allVariables);

        if (NUM<0) {
            System.out.println("вы сохранили отрицательное число");
        }else if (NUM>0) {
            System.out.println("вы сохранили положительное число");
        }else {
            System.out.println("Вы сохранили ноль");
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите Имя: ");
        String name = scan.nextLine();
        System.out.println("Hello "+ name );




    }
}
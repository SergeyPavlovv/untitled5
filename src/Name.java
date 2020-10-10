import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        System.out.println("Здравствуйте!");
        System.out.println("fff");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        String name ;
        name = scanner.next();
        System.out.println("Ваше имя " + name);
        scanner.close();

        System.out.println("Спасибо!");


    }
}

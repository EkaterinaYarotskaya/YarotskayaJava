import java.util.Arrays;
import java.util.Scanner;

public class Tasks {

    public void workWithNumber() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = input.nextInt();
        if (number > 7) {
            System.out.println("Привет");
        }
    }

    public void workWithName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = input.nextLine();
        if (name.equals("Вячеслав")) {
            System.out.println("Привет," + name);
        } else System.out.println("Нет такого имени");
    }

    public void workWithArray() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите массив цифр разделённых запятой :");
        String a = input.nextLine();
        Arrays.stream(a.split(",")).mapToInt(Integer::parseInt).filter(x->x%3==0).forEach(System.out::println);

    }
}


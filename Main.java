import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите сумму денег:");
        int money = sc.nextInt();

        System.out.println("Введите цену одной шоколадки:");
        int price = sc.nextInt();

        System.out.println("Введите количество обёрток для получения бесплатной шоколадки:");
        int wrap = sc.nextInt();

        if (money < 0 || price <= 0 || wrap <= 0) {
            System.out.println("Некорректные данные");
            return;
        }

        int count = money / price; // количество купленных шоколадок
        int wrappers = count; // количество обёрток

        // обмен обёрток на бесплатные шоколадки
        while (wrappers >= wrap) {
            int free = wrappers / wrap;
            count += free;
            wrappers = wrappers % wrap + free;
        }

        System.out.println("Всего шоколадок: " + count);

        sc.close();
    }
}
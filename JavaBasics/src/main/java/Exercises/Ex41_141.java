package Exercises;

//141. Простой каталог товаров.
//улучшите программу из предыдущей задачи ex40_140:

//количество товара после ввода преобразуйте в тип int. Проверять правильность ввода пользователя не нужно. Понадеемся,
// что он будет вводить только числа

//если пользователь вводит несколько одинаковых наименований товара, их количество должно суммироваться в одном ключе
// словаря

import java.util.HashMap;
import java.util.Scanner;

public class Ex41_141 {
    public static void main(String[] args) {
        HashMap<String, Integer> catalog = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            String item = scanner.next();
            Integer qty = scanner.nextInt();
            if (catalog.containsKey(item)) {
                catalog.put(item, catalog.get(item) + qty);

            } else catalog.put(item, qty);
        }
        for (String key : catalog.keySet()) {
            int value = catalog.get(key);
            System.out.println(key + " : " + value);

        }

    }


}

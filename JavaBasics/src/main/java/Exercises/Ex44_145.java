package Exercises;

//145. entrySet().
//Усовершенствуйте программу из задачи 41 «Улучшить простой каталог товаров.». Единственное, что нужно там изменить —
// - это вывод результата на экран. Сделайте это с помощью метода entrySet().

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Ex44_145 {
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
        for (Map.Entry<String, Integer> keysValues : catalog.entrySet()) {
            System.out.println(keysValues.getKey() + " : " + keysValues.getValue());
        }

    }
}


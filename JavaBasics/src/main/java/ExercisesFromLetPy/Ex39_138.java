package ExercisesFromLetPy;

//138. Первая программа со словарем.
//написать программу, в которой переменной firstMap присвоен словарь.
//
//В этом словаре должно быть три ключа:
//Первый ключ должен быть строкой, а его значение должно быть целым числом. Значение строки и числа могут быть любыми.
//Второй ключ должен быть любым кортежем, а его значение — любым списком.
//Третий ключ должен быть числом с плавающей запятой, а его значение — любой строкой
//Программа должна вывести на экран значение каждого из ключей.

import java.util.HashMap;
import java.util.Map;

public class Ex39_138 {
    public static void main(String[] args) {
        // Карта со смешанным содержимым
        HashMap<Object, Object> firstMap = new HashMap<>();
        firstMap.put("Строка", 123);
        firstMap.put(new int[]{1, 3}, "dfd");
        firstMap.put(3.14, "Пи");
        System.out.println(firstMap.keySet());

        // Карта с однотипными ключами и значениями
        HashMap<Integer, String> secondMap = new HashMap<>();
        secondMap.put(1, "Первый");
        System.out.println(secondMap);


        // Карта с заполнением при инициализации
        Map<Integer, Integer> thirdMap = Map.ofEntries(
                Map.entry(1, 2),
                Map.entry(3, 4),
                Map.entry(5, 6)
        );
        System.out.println(thirdMap);
    }


}

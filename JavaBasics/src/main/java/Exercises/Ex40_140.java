package Exercises;

//140. Простой каталог товаров.
//Напишите программу, с помощью которой пользователь сможет заполнить простой каталог товаров.
//
//В программе должен быть создан пустой словарь — catalog. С помощью цикла программа должна предложить ввести
// пользователю три товара. В каждой итерации цикла должно вводиться два значения — наименование и количество товара.
// Наименование и количество должны вводиться с помощью двух разных вызовов функции.
//
//Каждое наименование и количество надо добавить в словарь catalog. Наименование должно быть ключом, а количество —
// - значением этого ключа.
//
//После ввода товаров, программа должна вывести на экран все введенные товары с помощью цикла for — то есть ключи и
// значения словаря catalog. Каждый товар должен быть выведен на отдельной строке, а наименование и количество должны
// быть разделены двоеточием.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex40_140 {
    public static void main(String[] args) {
        HashMap<String, Integer> catalog = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("Введите товар " + i);
            String item = scanner.next();
            System.out.println("Введите количество товара " + i);
            Integer qty = scanner.nextInt();
            catalog.put(item, qty);
        }
        for (String key: catalog.keySet()){
            int value = catalog.get(key);
            System.out.println(key + " : " + value);
        }
    }


}

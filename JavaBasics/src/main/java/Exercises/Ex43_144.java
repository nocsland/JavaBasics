package Exercises;

//144. Сортировка одинаковых слов.
//написать программу, которая делает тоже самое, что и в уроке «Подсчёт одинаковых слов» с одним лишь отличием — слова
// должны выводиться на экран в алфавитном порядке.

import java.util.Scanner;
import java.util.TreeMap;


public class Ex43_144 {
    public static void main(String[] args) {
        TreeMap<String, Integer> countWords = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().toLowerCase().replaceAll("[,.]", " ").split(" ");
        for (String s : strings) {
            if (countWords.containsKey(s)) {
                countWords.put(s, countWords.get(s) + 1);

            } else countWords.put(s, 1);
        }
        for (String key : countWords.keySet()) {
            int value = countWords.get(key);
            System.out.println(key + " : " + value);
        }

    }


}

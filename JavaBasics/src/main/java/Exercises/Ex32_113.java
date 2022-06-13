package Exercises;

//113. Сколько раз встречается слово.
//Написать программу, которая подсчитывает и выводит на экран, сколько раз заданное слово встречается в предложении. И
// слово, и предложение, должны быть получены от пользователя с помощью клавиатуры. Первым по очереди должно быть
// получено предложение, а вторым — слово для подсчета. Вывести на экран сколько раз встречается слово.
// Слова должны считаться одинаковыми без учёта регистра.

import java.util.Scanner;

public class Ex32_113 {
    public static void main(String[] args) {
        int countWord = 0;
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().toLowerCase().replaceAll("[,.]", " ").split(" ");
        String word = scanner.nextLine().toLowerCase();
        for (String s : words) {
            if (s.equals(word)) {
                countWord += 1;
            }
        }
        System.out.println(countWord);

    }
}


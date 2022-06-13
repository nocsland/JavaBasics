package Exercises;

//114. Фильтр слов.
//написать программу, которая из текста, введенного пользователем, создает список слов. В список должны попадать слова,
// в которых есть только буквы и цифры. Остальные слова должны игнорироваться.  Отфильтрованные слова нужно вывести на
// экран одной строкой.

import java.util.ArrayList;
import java.util.Scanner;

public class Ex33_114 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();
        String[] stringsArray = scanner.nextLine().split(" ");
        for (String s : stringsArray) {
            if (s.matches("^[а-яА-ЯёЁa-zA-Z\\d]+$")) {
                words.add(s);
            }
        }
        System.out.println(String.join(" ", words));
    }

}


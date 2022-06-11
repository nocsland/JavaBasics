package Exercises;

//Написать программу, которая подсчитывает количество слов в предложении, введенном пользователем. Предложение должно
//быть введено с клавиатуры и сохранено в переменной string. Слова разделены пробелами. Тип этой переменной должен
// оставаться строкой. Получившееся количество слов программа должна вывести на экран.

import java.util.Scanner;

public class Ex29_102 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println(string.split(" ").length);
    }


}

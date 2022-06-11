package Exercises;

//Написать программу, которая определяет, является ли введённый пользователем текст палиндромом.
//Программа должна вывести на экран «да», если введённый текст — палиндром и «нет» — если нет.

import java.util.Scanner;

public class Ex21_76 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine().toLowerCase().replace(" ", "");
        if (string.equals(reverseString(string))) {
            System.out.println("да");
        } else System.out.println("нет");
    }

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }


}

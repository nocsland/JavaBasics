package Exercises;

//Напишите программу, которая записывает строку, введённую пользователем в переменную string. Программа должна проверить
// длину строки. Если длина строки больше либо равна пяти — программа должна вывести первые три и последние три символа
// введенной строки. Иначе — программа должна вывести надпись «Ошибка»

import java.util.Scanner;

public class Ex20_74 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        if (string.length() >= 5){
            System.out.printf("%s %s",string.substring(0,3),string.substring(string.length()-3));

        } else System.out.println("Ошибка");
    }




}

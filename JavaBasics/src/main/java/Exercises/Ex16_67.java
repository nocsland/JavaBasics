package Exercises;

//Напишите программу, в которой переменной string присвоено значение, введённое пользователем. Тип переменной
// string — строка.
//
//Программа должна преобразовать строку, введённую пользователем в верхний регистр с помощью метода upper и вывести на
// экран преобразованную строку.

import java.util.Scanner;

public class Ex16_67 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println(string.toUpperCase());
    }



}

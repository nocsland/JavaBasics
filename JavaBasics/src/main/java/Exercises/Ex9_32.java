package Exercises;

//Переменной hello присвойте значение «Привет,» или «Здравствуй,»
//Переменной name присвойте значение, полученное от пользователя с помощью клавиатуры.
//Переменной greeting присвойте значение, равное склеенным строкам hello и name.
//Выведите значение переменной greeting на экран.

import java.util.Scanner;

public class Ex9_32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String hello = "Привет, ";
        String greeting = hello + name + "!";
        System.out.println(greeting);

    }


}

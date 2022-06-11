package Exercises;

//Напишите программу, в которой переменной string присвоено значение, введённое пользователем. Тип переменной
// string — строка.
//Программа должна вывести каждую букву переменной string на новой строке.

import java.util.Scanner;

public class Ex26_86 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        for (int i = 0; i < string.length(); i++){
            System.out.println(string.charAt(i));
        }

    }


}

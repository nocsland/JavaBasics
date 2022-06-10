package Exercises;

//Присвойте переменным a и b значения, введённые пользователем. Программа должна сложить эти две переменные и вывести
//на экран результат конкатенации строки «Сумма=» и преобразованной в строку сумму переменных a и b.

import java.util.Scanner;

public class Ex11_39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Сумма=" + (a + b));

    }


}

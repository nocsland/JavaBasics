package ExercisesFromLetPy;

//153. Найти факториал.
//Написать программу со своей функцией, которая высчитывает и выводит на экран факториал числа, введенного
// пользователем.

import java.util.Scanner;


public class Ex45_153 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        factorial(number);
        System.out.println(factorialRecursive(number));


    }

    // Обычный способ
    public static void factorial(int n) {
        int result = 1;
        for (int i = 1; i < n + 1; i++) {
            result *= i;

        }
        System.out.println(result);

    }

    // С использованием рекурсии
    public static int factorialRecursive(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorialRecursive(n - 1);
        }

    }

}



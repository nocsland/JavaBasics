package ExercisesFromJavaRush.Level6;

/*
Reverse
Необходимо написать программу, которая:

Считывает с консоли целое число N.
Если считанное число N больше 0, то программа дальше считывает целые числа, количество которых равно N.
Вывести в консоль считанные числа, если N нечетное — в порядке ввода, иначе — в обратном порядке.
Каждое число выводить с новой строки. Число N выводить не нужно.
Требования:
•	Программа должна считывать число N и за ним еще N чисел.
•	В классе должен быть метод public static void main(String[]).
•	Нельзя добавлять новые методы в класс Solution.
•	Программа должна выводить введенные N чисел в обратном порядке, если N чётное.
•	Программа должна выводить введенные N чисел в том же порядке, если N нечётное.
*/

import java.util.Scanner;

public class JRProTask0505 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array;
        int number = scanner.nextInt();
        if (number > 0) {
            array = new int[number];
            for (int i = 0; i < number; i++) {
                array[i] = scanner.nextInt();
            }
            for (int i = 0; i < number; i++) {
                if (number % 2 == 0) {
                    System.out.println(array[number - i - 1]);
                } else System.out.println(array[i]);
            }

        }
    }
}





package ExercisesFromJavaRush.Level4;

/*
В методе main() есть переменная double glass = 0.5, которая символизирует наполовину заполненный стакан. Для пессимиста он наполовину пуст, а для оптимиста - наполовину полон.
Необходимо считать с клавиатуры данные типа boolean, используя метод nextBoolean() объекта типа Scanner. В зависимости от полученных данных, округлить переменную glass: до целого числа вниз (0), если пессимист (false) и до целого числа вверх (1), если оптимист (true).
Результат вывести на экран.

Подсказка:
Чтобы округлить вещественное число до целого вниз, используй метод Math.floor(), вверх - метод Math.ceil().

Требования:
Программа должна считывать c клавиатуры данные типа boolean.
Программа должна выводить целое число на экран согласно условию.
В программе необходимо использовать метод Math.floor().
В программе необходимо использовать метод Math.ceil().
*/

import java.util.Scanner;

public class Ex_JR_pro_task_04_18 {
    public static void main(String[] args) {
        double glass = 0.5;
        int result;
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextBoolean()) {
            boolean isOptimist = scanner.nextBoolean();
            if (isOptimist) {
                result = (int) (Math.ceil(glass));
                System.out.println(result);
            } else {
                result = (int) (Math.floor(glass));
                System.out.println(result);
            }
        } else System.out.println("Необходимо ввести булево значение");


    }

}

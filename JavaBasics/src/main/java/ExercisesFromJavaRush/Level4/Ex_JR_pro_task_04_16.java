package ExercisesFromJavaRush.Level4;

/*
Площадь круга.
Для решения этой задачи нужно:
Ввести с клавиатуры положительное целое число radius. Это будет радиус окружности.
Вывести на экран площадь круга, рассчитанную по формуле: S = pi * radius * radius.
Результатом должно стать целое число (тип int). Для этого нужно привести к типу int результат умножения (отбросить
дробную часть, округлив вниз до целого числа).
В качестве значения pi используй 3.14.

Требования:
Программа должна считывать целое число c клавиатуры.
Программа должна выводить число на экран.
Программа должна выводить на экран площадь круга радиусом radius, приведенную к целому числу.
        square = (int)(3.14 * radius * radius);
*/

import java.util.Scanner;

public class Ex_JR_pro_task_04_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int colaQuantity = scanner.nextInt();
        int howManyPeople = scanner.nextInt();
        double result = (1.0 * colaQuantity / howManyPeople);
        System.out.println(result);

    }
}

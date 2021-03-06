package ExercisesFromJavaRush.Level4;

/*
Площадь круга.
Обычно скорость ветра указывается в м/с и не всегда понятно, насколько это много или мало.
Привычнее видеть величину скорости в км/ч, как у автомобиля, велосипеда или другого транспорта.
Поэтому сделаем конвертер величин скорости из м/с в км/ч.
Исходную величину скорости ветра в м/с нужно получить, считав ее как целое число из клавиатуры.
Соотношение скоростей такое: 1 м/с = 3.6 км/ч.
Необходимо вывести на экран скорость ветра в км/ч, округленную до ближайшего целого числа.
Для округления необходимо использовать метод Math.round().

Требования:
Программа должна считывать целые числа c клавиатуры.
Программа должна выводить число на экран.
Программа должна выводить на экран целое число - результат округления введенного целого числа, умноженного на 3.6.
В программе необходимо использовать метод Math.round().
*/

import java.util.Scanner;

public class Ex_JR_pro_task_04_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int metersPerSecond = scanner.nextInt();
        int kilometersPerHour = (int) (Math.round(metersPerSecond * 3.6));
        System.out.println(kilometersPerHour);
    }
}

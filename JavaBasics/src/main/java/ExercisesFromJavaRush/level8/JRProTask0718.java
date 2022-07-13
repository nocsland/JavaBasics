package ExercisesFromJavaRush.level8;

/*
Взлет с планеты.
Активируем навигационную систему и рассчитаем ускорение, чтобы компенсировать гравитацию планеты и вывести корабль на
орбиту. В результате корабль взлетает с поверхности планеты и выходит в космос.

Для этого нужно реализовать два метода: changePrimitive(int) и changeObject(int[]).
В методе changePrimitive(int) нужно увеличить значение входящего параметра на 1.
В методе changeObject(int[]) нужно увеличить значение каждого элемента массива на 1.

Запусти метод main(), чтобы посмотреть результат работы.

Требования:
•	Метод changePrimitive(int) реализовать согласно условию.
•	Метод changeObject(int[]) реализовать согласно условию.
*/

import java.util.Arrays;

public class JRProTask0718 {

    public static void changePrimitive(int number) {
        number += 1;
        System.out.println("Значение переменной number внутри метода changePrimitive(int) равно " + number);
    }

    public static void changeObject(int[] array) {
        for (int i = 0; i < array.length; i++){
            array[i] += 1;

        }
        System.out.println("Значение всех элементов массива array внутри метода changeObject(int[]) равно " + Arrays.toString(array));
    }

    public static void main(String[] args) {
        int number = 2020;
        System.out.println("Значение переменной number до вызова метода changePrimitive(int) равно " + number);
        changePrimitive(number);
        System.out.println("Значение переменной number после вызова метода changePrimitive(int) равно " + number);

        System.out.println("------------------------------------------------------------------------------------------");

        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Значения всех элементов массива array до вызова метода changeObject(int[]) равно " + Arrays.toString(array));
        changeObject(array);
        System.out.println("Значение всех элементов массива array после вызова метода changeObject(int[]) равно " + Arrays.toString(array));
    }
}







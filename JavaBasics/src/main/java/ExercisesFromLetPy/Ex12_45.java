package ExercisesFromLetPy;

//Напишите программу, в которой переменной a присвоено значение, введённое пользователем. Переменная a должна быть целым
//числом. Не забудьте преобразовать строку, полученную из input в число с помощью функции int.
//Потом программа должна проверить значение переменной a. Если ее значение больше 5 — программа должна вывести на экран
// значение переменной a

import java.util.Scanner;

public class Ex12_45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a > 5) {
            System.out.println(a);
        }
    }


}

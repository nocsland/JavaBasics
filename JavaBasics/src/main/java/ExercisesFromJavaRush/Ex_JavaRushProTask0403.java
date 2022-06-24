package ExercisesFromJavaRush;

import java.util.Scanner;

// Напишем программу, в которой нужно вводить с клавиатуры целые числа и считать их сумму, пока пользователь не введет
// слово "ENTER". Вывести на экран полученную сумму и завершить программу.
// Требования:
//Программа должна считывать данные c клавиатуры.
//Необходимо посчитать сумму введенных целых чисел и вывести её на экран, если пользователь ввел стоп слово.
//В программе необходимо использовать цикл while.

public class Ex_JavaRushProTask0403 {
    public static void main(String[] args) {
        boolean isEnter = false;
        int result = 0;
        Scanner sc = new Scanner(System.in);
        while (!isEnter) {
            String numbers = sc.nextLine();
            isEnter = numbers.equals("ENTER");
            if (!isEnter) {
                result += Integer.parseInt(numbers);
            }
        }
        System.out.println(result);

    }
}

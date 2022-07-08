package ExercisesFromJavaRush.Level4;

/*
Сумма кратных чисел
Напиши программу, где в методе main с клавиатуры считывается 3 целых числа: start, end (start <= end), multiple.
программа, выводит на экран сумму чисел от start (включительно) до end (не включительно), кратных multiple.
Для этого используй цикл for.
Подсказка: чтобы перейти к следующей итерации цикла, используй оператор continue.

Требования:
•	Программа должна вывести в консоль сумму чисел от start (включительно) до end (не включительно), кратных multiple.
•	В программе необходимо использовать цикл for.
•	В цикле for необходимо использовать оператор continue.
*/

import java.util.Scanner;

public class Ex_JR_pro_task_04_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int multiple = scanner.nextInt();
        int sum = 0;
        for (int i = start; i < end; i++){
            if(i % multiple != 0){
                continue;
            }else sum += i;
        }

        System.out.println(sum);
    }
}

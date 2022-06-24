package ExercisesFromJavaRush;

/*
Среднее арифметическое из 5 введенных чисел
Написать программу, где в цикле for нужно считать 5 целых чисел, вычислить их среднее арифметическое и вывести на экран.

Требования:
•	Программа должна считать с клавиатуры 5 целых чисел.
•	В программе необходимо использовать цикл for.
•	Нужно вывести на экран среднее арифметическое из введенных чисел.

*/



import java.util.Scanner;

public class Ex_JR_pro_task_04_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        for (int i=1; i <=5; i++){
            int number = scanner.nextInt();
            result += (number);
        }
        System.out.println((double)result/5);

    }
}

package ExercisesFromJavaRush.Level4;

/*
Напиши программу, которая считывает с клавиатуры целые числа и выводит их на экран, пока не введено число, кратное 10.
В программе нужно использовать цикл do-while.

Требования:
Программа должна считать с клавиатуры целые числа.
В программе необходимо использовать цикл do-while.
Нужно выводить на экран считанные числа, пока не будет введено число кратное 10.

*/



import java.util.Scanner;

public class Ex_JR_pro_task_04_24 {
    public static void main(String[] args) {
        Scanner bombInterface = new Scanner(System.in);
        int number;
        do {
            number = bombInterface.nextInt();
            System.out.println(number);

        }while(number % 10 != 0);


    }
}

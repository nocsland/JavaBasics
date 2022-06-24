package ExercisesFromJavaRush;

/* Второе минимальное число из введенных
Считывать целые числа с клавиатуры до тех пор, пока не будет введено что-то другое: например, строка или символ.
Должно быть введено минимум два числа. Если введено меньше двух целых чисел, то такую ситуацию обрабатывать не нужно, а
программа может быть завершена с ошибкой.
Вывести на экран второе по величине целое число после минимального из введенных с клавиатуры. Если таких чисел
несколько, то необходимо вывести любое из них.
Минимальных чисел тоже может быть несколько.
Требования:
•	Программа должна считывать числа c клавиатуры.
•	Программа должна выводить число на экран.
•	Программа должна выводить на экран второе минимальное из введенных целых чисел.
•	Если введено несколько вторых минимальных чисел, необходимо вывести любое.
•	Считывать данные с клавиатуры необходимо в цикле while.
 */


import java.util.Scanner;

public class Ex_JR_pro_task_04_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstMinimum = Integer.MAX_VALUE;
        int secondMinimum = firstMinimum;
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number < firstMinimum){
                secondMinimum = firstMinimum;
                firstMinimum = number;
            }else if (number > firstMinimum && number <= secondMinimum){
                secondMinimum = number;
            }
        }
        System.out.println(secondMinimum);
    }
}

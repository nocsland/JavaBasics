package ExercisesFromJavaRush.Level6;

/*
Максимальное из N чисел

В этой задаче необходимо:
Ввести с клавиатуры число N.
Считать N целых чисел и заполнить ими массив array.
Найти максимальное число среди элементов массива.
Требования:
В методе main(String[]) считай с клавиатуры число N, потом проинициализируй массив array размером N элементов, и заполни числами с клавиатуры.
В методе main(String[]) выведи в консоль максимальное число среди элементов массива.
*/

import java.util.Scanner;

public class JRProTask0507 {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        int max = Integer.MIN_VALUE;
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = scanner.nextInt();
            if (array[i] > max) {
                max = array[i];
            }
        }System.out.println(max);
    }
}






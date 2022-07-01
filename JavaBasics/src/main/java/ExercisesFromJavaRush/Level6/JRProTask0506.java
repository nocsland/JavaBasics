package ExercisesFromJavaRush.Level6;

/*
Минимальное из N чисел
Чтобы выполнить эту задачу, необходимо:

Ввести с клавиатуры число N.
Считать N целых чисел и заполнить ими массив.
Найти минимальное число среди элементов массива и вывести в консоль.
Требования:
В методе main(String[]) считай с клавиатуры число N, потом проинициализируй массив array размером N элементов и заполни числами с клавиатуры.
В методе main(String[]) выведи в консоль минимальное число среди элементов массива.
*/

import java.util.Scanner;

public class JRProTask0506 {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        int minimum = Integer.MAX_VALUE;
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        array = new int[n];
        for(int i=0; i < n; i++){
            array[i] = scanner.nextInt();
            if (array[i] < minimum){
                minimum = array[i];
            }
        }System.out.println(minimum);


    }
}





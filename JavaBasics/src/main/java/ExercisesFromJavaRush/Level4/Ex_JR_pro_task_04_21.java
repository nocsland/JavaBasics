package ExercisesFromJavaRush.Level4;

//Подсчитать сумму четных чисел в диапазоне от 1 до 100 включительно с использованием цикла while.
//Требования:
//Программа должна вывести в консоль сумму всех четных чисел от 1 до 100 включительно.
//В программе необходимо использовать цикл while.


public class Ex_JR_pro_task_04_21 {
    public static void main(String[] args) {
        int i = 0;
        int result = 0;
        while (i <= 100) {
            if (i % 2 == 0) {
                result += i;
            }
            i++;
        }
        System.out.println(result);
    }
}

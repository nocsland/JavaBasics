package ExercisesFromJavaRush.Level4;

// Необходимо считать с клавиатуры число больше 0 и вывести в консоль сумму всех чисел от 0 до введенного числа
// включительно. Для этого используй цикл while.
//Если введенное число равно 0 или меньше, то в консоль вывести 0.
//Требования:
//Программа должна вывести в консоль сумму всех чисел от 0 до числа введенного с клавиатуры включительно.
//Программа должна вывести в консоль 0, если введенное число меньше либо равно 0.
//В программе необходимо использовать цикл while.


import java.util.Scanner;

public class Ex_JR_pro_task_04_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        int n = 0;
        if (number <= 0 ){
            System.out.println("0");
        } else {
            while (n<=number){
                sum += n;
                n++;
            }
            System.out.println(sum);
        }
    }
}

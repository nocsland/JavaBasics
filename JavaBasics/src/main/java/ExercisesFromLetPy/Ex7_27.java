package ExercisesFromLetPy;

//Написать программу, которая обменивает две переменные значениями. Вывести значения переменных на экран

public class Ex7_27 {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int tmp;
        System.out.printf("%d %d\n", a, b);

        tmp = a;
        a = b;
        b = tmp;
        System.out.printf("%d %d", a, b);

    }


}

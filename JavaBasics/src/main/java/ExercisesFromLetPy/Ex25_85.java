package ExercisesFromLetPy;

//Напишите программу, которая выводит на экран все нечетные числа начиная с 31 и заканчивая 11. Каждое из чисел должно
// быть выведено на новой строке. Для создания цикла используйте оператор while.

public class Ex25_85 {
    public static void main(String[] args) {
        int i = 31;
        while (i >= 11) {
            System.out.println(i);
            i -= 2;
        }
    }


}

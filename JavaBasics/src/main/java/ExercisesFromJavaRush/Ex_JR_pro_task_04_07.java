package ExercisesFromJavaRush;

//Вывести на экран сумму чисел от 1 до 100 включительно, не кратных 3. Для этого используй цикл while.
//Подсказка: чтобы в цикле перейти к следующему числу, используй оператор continue.
//Требования:
//Программа должна вывести в консоль сумму всех чисел от 1 до 100 включительно, не кратных 3.
//В программе необходимо использовать цикл while.
//В программе необходимо использовать оператор continue.


public class Ex_JR_pro_task_04_07 {
    public static void main(String[] args) {
        int i = 0;
        int result = 0;
        while (i <= 100){
            if (i % 3 == 0){
                i++;
                continue;

            }else result += i;
            i++;
        }System.out.println(result);

    }
}

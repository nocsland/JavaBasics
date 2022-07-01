package ExercisesFromJavaRush.Level6;

/*
Охота на Кибердракона
Дан массив чисел. В методе main нужно посчитать:

х — сумму всех нечетных значений элементов массива
у — сумму всех четных значений элементов массива
и вывести в виде: (х;у)
Требования:
В классе Solution должна быть публичная статическая переменная coordinates типа int[] проинициализирована массивом чисел.
В методе main(String[]) необходимо посчитать и вывести на экран суммы четных и нечетных элементов массива согласно условию.
*/

public class JRProTask0523 {
    public static int[] coordinates = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args) {
        int y = 0;
        int x = 0;

        for (int i = 0; i < coordinates.length; i++){
            if(coordinates[i] % 2 == 0){
                y += coordinates[i];
            }else x += coordinates[i];
        }System.out.println("(" + x + ";" + y + ")");
    }
}


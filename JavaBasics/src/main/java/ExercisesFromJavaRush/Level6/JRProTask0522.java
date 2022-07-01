package ExercisesFromJavaRush.Level6;

/*
Поиск Кибердракона 9000
В методе main проинициализируй переменную desert массивом элементов типа int и размером 10. Третьему элементу массива
присвой значение 5. Остальные элементы не трогай.

Требования:
В классе Solution должна быть публичная статическая переменная desert типа int[].
В методе main(String[]) проинициализируй переменную desert согласно условию.
Третьему по счету элементу массива desert должно быть присвоено значение 5. Остальные элементы не изменять.
*/

public class JRProTask0522 {
    public static int[] desert;

    public static void main(String[] args) {
        desert = new int[10];
        desert[2] = 5;
    }
}


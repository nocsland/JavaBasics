package ExercisesFromJavaRush.Level6;

/*
Объединяем массивы
Реализовать метод main(String[]), в котором нужно скопировать содержимое массивов firstArray и secondArray в один массив
resultArray.
Массив firstArray должен быть в начале нового массива resultArray, а secondArray — после него.
Программа должна правильно обрабатывать массивы любой длины.

Требования:
•	В классе Solution должна быть публичная статическая переменная firstArray типа int[], проинициализированная массивом
 с 10-ю значениями.
•	В классе Solution должна быть публичная статическая переменная secondArray типа int[], проинициализированная
 массивом с 10-ю значениями.
•	В классе Solution должна быть публичная статическая переменная resultArray типа int[].
•	Реализуй метод main(String[]) согласно условию.
*/

public class JRProTask0504 {
    public static int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    public static int[] resultArray;

    public static void main(String[] args) {
        resultArray = new int [firstArray.length + secondArray.length];
        int count = 0;
        for (int a = 0; a < firstArray.length; a++){
            resultArray[a] = firstArray[a];
            count++;
        }
        for (int b = 0; b < secondArray.length; b++){
            resultArray[count++] = secondArray[b];
        }

        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + ", ");
        }
    }
}




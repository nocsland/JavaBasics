package ExercisesFromLetPy;

//Написать программу, в которой есть три переменные:
//Первая должна называться firstArray и быть массивом только числовых значений. То есть элементы firstArray могут быть
// только целые или дробные числа.
//Вторая переменная secondArray должна быть массивом строк, и, соответственно, содержать только строковые значения.
//Третья переменная thirdArray должна быть массивом, в котором есть элементы как строчного, так и числового типа.

import java.util.Arrays;

public class Ex28_101 {
    public static void main(String[] args) {
        int[] firstArray = new int[3];
        firstArray[0] = 1;
        firstArray[1] = 2;
        firstArray[2] = 3;

        int[] yetIntArray = new int[]{1, 2, 3}; // Можно не указывать длинну массива, и сразу заполнять значениями

        String[] secondArray = new String[2];
        secondArray[0] = "first";
        secondArray[1] = "second";

        String[] yetStringArray = new String[]{"один", "два"}; // Можно не указывать длинну массива, и сразу заполнять

        Object[] thirdArray = new Object[2];
        thirdArray[0] = 123;
        thirdArray[1] = "Строка из массива смешанных типов";

        Object[] yetMixArray = new Object[]{1, "Два", 3.14}; // Можно не указывать длинну массива, и сразу заполнять

        System.out.printf("%d\n %s\n %s\n", firstArray[0], secondArray[0], thirdArray[1]);
        System.out.println(yetIntArray[0]);
        System.out.println(yetStringArray[1]);
        System.out.println(Arrays.toString(yetMixArray)); // Вывод всего массива в виде списка

    }


}

package ExercisesFromJavaRush.level11.task1012;/*
Дефрагментация памяти
*/

import java.util.Arrays;

public class Memory {

    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {
        String cache;
        int offset = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                cache = array[i];
                array[i] = null;
                array[offset] = cache;
                offset++;
            }

        }


    }
}
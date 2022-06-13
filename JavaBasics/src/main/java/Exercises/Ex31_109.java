package Exercises;

//Напишите программу, которая переворачивает слова в предложении. Выведите перевернутое предложение на экран.

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex31_109 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");
        reverseStringsArray(words);
        System.out.println(String.join(" ", words));

    }

    static void reverseStringsArray(String[] array) {
        Collections.reverse(Arrays.asList(array));
    }

}

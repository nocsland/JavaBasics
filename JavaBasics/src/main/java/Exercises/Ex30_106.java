package Exercises;

//Написать пронаписать программу, которая находит самое длинное слово в предложении, введенном пользователем.
//Самое длинное слово должно быть выведено на экран

import java.util.Scanner;

public class Ex30_106 {
    public static void main(String[] args) {
        String longestWord = "";
        Scanner scanner = new Scanner(System.in);
        String[] string = scanner.nextLine().split(" ");
        for (String s : string) {
            if (s.length() > longestWord.length()) {
                longestWord = s;
            }
        }
        System.out.println(longestWord);

    }


}

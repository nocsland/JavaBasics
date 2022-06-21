package ExercisesFromLetPy;

//Программа, которую вы напишете в этом уроке, должна получить строку от пользователя с клавиатуры. Если в строке
// найден символ #, программа должна вывести часть строки до этого символа. Иначе — программа должна вывести на экран
// исходную строку.

import java.util.Scanner;


public class Ex23_79 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int index = string.indexOf("#");
        if (index != -1) {
            System.out.println(string.substring(0, index));
        } else System.out.println(string);

    }


}

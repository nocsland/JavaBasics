package ExercisesFromLetPy;

//Напишите программу, которая записывает строку, введённую пользователем в переменную string. Программа должна проверить
// длину строки. Если длина строки больше либо равна двум — программа должна вывести первый и последний символ этой
// строки. Иначе — программа должна вывести надпись «Ошибка»

import java.util.Scanner;

public class Ex19_72 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        if (string.length() >= 2){
            System.out.printf("%s %s",string.charAt(0),string.charAt(string.length()-1));
        } else System.out.println("Ошибка");
    }




}

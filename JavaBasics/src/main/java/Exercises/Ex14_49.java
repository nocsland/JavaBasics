package Exercises;

//Напишите программу, которая в переменную number записывает число, введённое пользователем.
//Если число больше 0, программа должна вывести на экран +, если число меньше 0, программа должна вывести на экран -, а
// если число равно 0, программа должна вывести 0,

import java.util.Scanner;

public class Ex14_49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number > 0){
            System.out.println("+");
        } else if (number < 0) {
            System.out.println("-");
        }else {
            System.out.println("0");
        }
    }


}

package Exercises;

//Напишите программу, которая описывает одним словом температуру, введённую пользователем. Программа должна сохранить
// введённую температуру в переменную t в виде целого числа.

//Если число меньше −4, программа должна вывести «морозно».
//Если число меньше 0 и больше либо равно −4, программа должна вывести на экран «холодно».
//Если число больше либо равно 0 и меньше 12 — «прохладно».
//Если больше либо равно 12 и меньше 27 — «тепло».
//Если больше либо равно 27 — «жарко».

import java.util.Scanner;

public class Ex15_55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        if (t < -4){
            System.out.println("морозно");
        } else if (t < 0) {
            System.out.println("холодно");
        } else if (t < 12) {
            System.out.println("прохладно");
        } else if (t < 27) {
            System.out.println("тепло");
        }else System.out.println("жарко");
    }



}

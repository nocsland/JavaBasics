package ExercisesFromLetPy;

//Напишите программу, которая преобразует номер телефона, введённого пользователем в защищённый вид.
//Программа должна проверить длину введённой строки. Если длина строки больше либо равна 8 и строка содержит только
// цифры, программа должна оставить в строке последние 4 цифры, а вместо начальных цифр вставить символ *. Этих
// звёздочек будет на 4 меньше, чем всего символов в исходной строке.
//Программа должна вывести на экран преобразованную строку.
//Если длина введённой строки меньше 8 или если в строке есть что‑то, кроме цифр — программа должна вывести на экран
// надпись «Ошибка». Программа не должна выводить ничего, кроме номера или надписи «Ошибка»

import java.util.Scanner;


public class Ex22_77 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        int lengthNumber = number.length();
        String hiddenSymbols = "*".repeat(lengthNumber - 4);
        if (number.length() >= 8 && Ex18_69.isNumeric(number)) {
            System.out.println(hiddenSymbols + number.substring(number.length() - 4));
        } else System.out.println("Ошибка");
    }


}

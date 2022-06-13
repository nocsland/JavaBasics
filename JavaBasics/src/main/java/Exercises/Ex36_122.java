package Exercises;

//122. Генератор паролей
//Первым делом создайте строку с допустимыми для пароля символами. Она должна называться symbols. После этого нужно
// получить от пользователя длину пароля с помощью клавиатуры. Далее нужно написать цикл for и в каждой его итерации
// получать случайный символ из строки symbols с помощью функции choice. Сгенерированный пароль из заданного количества
// символов нужно вывести на экран одной строкой.


import java.util.Scanner;

public class Ex36_122 {
    public static void main(String[] args) {
        String symbols = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder password  = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длинну пароля ");
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            password.append(symbols.charAt((int) (Math.random() * symbols.length())));
        }

        System.out.println(password);
    }
}

package ExercisesFromLetPy;

//Напишите программу для проверки пароля, введённого пользователем.
//В программе должна быть переменная с именем password — в ней будет храниться правильный пароль. Эта переменная будет
// строкой. Значение второй переменной с именем user_password, должно быть получено с помощью функции input. Переменная
// user_password тоже должна быть строкой.
//
//Если пользователь ввел правильный пароль, программа должна выводить надпись «Входите». Иначе — «Доступ запрещён».

import java.util.Scanner;

public class Ex13_47 {
    public static void main(String[] args) {
        String password = "пароль";
        Scanner scanner = new Scanner(System.in);
        String userPassword = scanner.nextLine();
        if (userPassword.equals(password)) {
            System.out.println("Входите");
        } else System.out.println("Доступ запрещен");
    }


}

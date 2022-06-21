package ExercisesFromLetPy;

//Напишите программу, в которой переменной string присвоено значение, введённое пользователем. Тип переменной
// string — строка.
//Программа должна вывести каждую букву переменной string на новой строке, используя цикл while. Если в строке
// встретятся два символа # подряд, цикл должен быть остановлен с помощью оператора break.

import java.util.Scanner;

public class Ex27_88 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int i = 0;
        while (i < string.length()) {
            if (string.startsWith("##", i)) {
                break;
            } else System.out.println(string.charAt(i));
            i += 1;
        }
    }


}

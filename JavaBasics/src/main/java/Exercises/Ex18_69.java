package Exercises;

//Присвойте переменным a и b значения, введённые пользователем. Не торопитесь преобразовывать
// переменные a и b в числа.
//
//Потом программа должна проверить, являются ли обе переменные строками, содержащими только цифры. Сделать это надо
// реализовав отдельный метод. Если в строке есть только цифры — вызов метода вернёт True. Если есть буквы или
// строка пустая — False. Чтобы проверить обе строки, используйте логический оператор &&.
//
//Если обе переменные — строки, которые содержат только цифры, преобразуйте их в числа с помощью функции
// Integer.parseInt(), сложите их и выведите на экран результат конкатенации строки «Сумма=» и преобразованной в
// строку сумму переменных a и b.
// Иначе выведите на экран текст «Ошибка».

import java.util.Scanner;

public class Ex18_69 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        if (isNumeric(a) && isNumeric(b)) {
            int result = Integer.parseInt(a) + Integer.parseInt(b);
            System.out.println("Сумма=" + result);
        } else System.out.println("Ошибка");
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


}

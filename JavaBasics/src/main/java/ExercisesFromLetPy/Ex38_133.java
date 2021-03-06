package ExercisesFromLetPy;

//133. Угадай число.
//написать программу, в которой предлагается угадать загаданное компьютером целое случайное число от 0 до 10 за три
// попытки.
//Первым делом присвойте переменной number значение, полученной с помощью функции random.
//После этого, программа должна дать три попытки на то, чтобы пользователь угадал число number. Для этого, с помощью
// цикла надо создать цикл на три итерации.
//В каждой итерации программа должна запрашивать у пользователя число. Если загаданное число меньше, чем число,
// которое ввел пользователь, программа должна вывести на экран "Загаданное число меньше"
//Если загаданное число больше, чем число, которое ввел пользователь, программа должна вывести на экран текст
//"Загаданное число больше"
//Если пользователь угадал, на экран должно быть выведено "Вы выиграли". Цикл при этом должен закончится с помощью
// break.
//Если за три попытки пользователь так и не угадал числа, программа должна вывести на экран текст
//Вы проиграли

import java.util.Scanner;

public class Ex38_133 {
    public static void main(String[] args) {
        int guestingNumber = (int) (Math.random() * 10);
        Scanner scanner = new Scanner(System.in);
        for (int i = 3; i >= 0; i--) {
            if (i < 1){
                System.out.println("Вы проиграли");
                break;
            }
            System.out.println("Угадайте число, у вас " + i + " попытки");
            int userNumber = scanner.nextInt();
            if (guestingNumber == userNumber) {
                System.out.println("Вы выиграли");
                break;
            } else if (guestingNumber < userNumber) {
                System.out.println("Загаданное число меньше");
            } else System.out.println("Загаданное число больше");
        }
        System.out.println("");
    }

}

package ExercisesFromJavaRush.Level4;

// В этом методе в бесконечном цикле считываются целые числа с клавиатуры. Каждое считанное число сравнивается с
// входящим параметром метода checkNumber.
//Если они одинаковые, то бесконечный цикл прерывается — загадочное число найдено и оно выводится в консоль.
//
//Вывод должен быть следующим:
//"Загадочное число равно <число>".
//
//Если числа разные — выводим в консоль фразу "Попробуй еще раз" и продолжаем поиск.
//
//Для прерывания цикла используй оператор break.
//Метод main() не участвует в тестировании.

//Требования:
//В методе checkNumber(int) необходимо вывести в консоль искомое число согласно условию.
//В программе необходимо использовать цикл while.
//В программе необходимо использовать оператор break.



import java.util.Scanner;

public class Ex_JR_pro_task_04_20 {
    public static void main(String[] args) {
        System.out.println("Введите предполагаемое число");

        checkNumber(3);
    }

    public static void checkNumber(int number) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            int inputNumber = scanner.nextInt();
            if (number == inputNumber){
                System.out.println("Загадочное число равно " + number);
                break;
            }else System.out.println("Попробуй еще раз");
        }
    }
}

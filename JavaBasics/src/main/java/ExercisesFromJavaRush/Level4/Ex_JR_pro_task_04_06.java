package ExercisesFromJavaRush.Level4;

//Вводим данные с клавиатуры и сразу их выводим на экран, пока не будет введено слово "enough".
//Слово "enough" выводить не нужно.
//Для этого необходимо использовать бесконечный цикл (while(true)).
//Подсказка: чтобы завершить бесконечный цикл, используй оператор break.

//Требования:
//Программа должна считывать данные c клавиатуры.
//В программе необходимо использовать цикл while.
//Для завершения бесконечного цикла необходимо использовать оператор break.
//Программа должна выводить в консоли все введенные данные с новой строки, пока на будет введено слово "enough".



import java.util.Scanner;

public class Ex_JR_pro_task_04_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String word = scanner.nextLine();
            if (word.equals("enough")){
                break;
            }else System.out.println(word);
        }

    }
}

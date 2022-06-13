package Exercises;

//120. Перетасовка дел.
//Первым делом нужно создать пустой список tasks. В него мы будем добавлять дела пользователя. Напишите бесконечный цикл
// while. В теле цикла с помощью функции input нужно получать очередное дело от пользователя и добавлять его в список
// tasks. Если пользователь просто нажмет кнопку ⏎ и функция input вернет пустую строку, цикл должен завершится с
// помощью оператора break.
//Затем нужно перетасовать список с делами. Сделать это можно с помощью модуля random, После того как дела будут
// перемешаны, нужно вывести их на экран с помощью цикла for. Каждое дело должно быть выведено на отдельной строке.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex35_120 {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true){
            String string = scanner.nextLine();
            if (string.isEmpty()){
                break;
            }else tasks.add(string);
        }
        Collections.shuffle(tasks);
        for (String s: tasks){
            System.out.println(s);
        }




    }
}

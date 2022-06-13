package Exercises;

//128. Класс ListIterator - итератор с индексом,
//Напишите программу, которая делит введённое пользователем предложение на слова. Учтите, что между словами может быть
// больше одного пробела. После этого программа должна вывести на экран слова вместе с порядковыми номерами в
// предложении. Номера должны начинаться с единицы.

import java.util.*;

public class Ex37_128 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] strings = scanner.nextLine().split(" ");
        ArrayList<String> words = new ArrayList<>(Arrays.asList(strings));
        ListIterator<String> it = words.listIterator();
        while (it.hasNext()){
            System.out.println(it.nextIndex()+1 + " " + it.next());
        }

    }

}

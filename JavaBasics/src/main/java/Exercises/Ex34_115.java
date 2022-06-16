package Exercises;

//115.Программа с сортировкой
//Напишите программу, которая получает строку от пользователя с помощью клавиатуры. Из этой строки программа должна
// получить список, разбив ее по символу пробела с помощью метода split. Потом программа должна создать переменную с
// пустым списком.
//С помощью цикла for программа должна перебрать элементы списка, получившегося после разбития строки и добавить в
// список numbers элементы, которые являются числами.
//После этого нужно отсортировать список numbers по возрастанию и вывести его на экран.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex34_115 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] strings = scanner.nextLine().split(" ");
        ArrayList <Integer> numbers = new ArrayList<>();
        for (String s: strings){
            if (s.matches("^\\d+$")){
                numbers.add(Integer.parseInt(s));
            }
        }
        Collections.sort(numbers);
        System.out.println(numbers);

    }


}


package ExercisesFromLetPy;

//142. Подсчёт одинаковых слов.
//написать программу, которая получает строку от пользователя с помощью input. Программа должна разделить строку на
// слова по символу пробела, точке или запятой и подсчитать, сколько раз каждое из слов встречается в строке. Разбить на
// слова будет проще, если предварительно заменить точки и запятые на символы пробела. Слова должны считаться
// одинаковыми без учёта регистра.
//Программа должна вывести слово, знак двоеточия и число раз, которое это слово встречается.

import java.util.HashMap;
import java.util.Scanner;


public class Ex42_142 {
    public static void main(String[] args) {
        HashMap<String, Integer> countWords = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().toLowerCase().replaceAll("[,.]"," ").split(" ");
        for (String s: strings){
            if (countWords.containsKey(s)){
                countWords.put(s,countWords.get(s)+1);

            }else countWords.put(s,1);
        }
        for (String key: countWords.keySet()){
            int value = countWords.get(key);
            System.out.println(key + " : " + value);
        }

    }




}

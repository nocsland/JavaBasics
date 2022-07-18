package ExercisesFromJavaRush.level7.level8;

/*
Запуск систем корабля
В классе Solution есть массив символов chars, который инициализирован кодами символов.
В методе main необходимо вывести все элементы массива в обратном порядке в одну строку. Это будет слово-пароль для
расконсервации корабля.

Требования:
•	Программа должна выводить одну строку без пробелов.
•	На экран должны выводится все символы из массива chars в обратном порядке.
*/

public class JRProTask0716 {
    public static char[] chars = {1076, 1086, 1088, 1084, 1080, 1053};

    public static void main(String[] args) {
        for (int i = chars.length-1; i >= 0 ; i--) {
            System.out.print(chars[i]);

        }
    }
}







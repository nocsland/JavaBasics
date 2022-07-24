package ExercisesFromJavaRush.level10;

/*
Экранирование символов
Выведи на экран следующий текст в две строки:
It's a Windows path: "C:\Program Files\Java\jdk-13.0.0\bin"
It's a Java string: \"C:\\Program Files\\Java\\jdk-13.0.0\\bin\"

Подсказка:
\” – экранирование двойной кавычки;
\\ – экранирование обратной косой черты (\).

Больше про экранирование символов и Escape-последовательности в Java читай в статье "Экранирование символов в Java".

Требования:
•	Нужно, чтобы программа выводила текст.
•	Нужно, чтобы было выведено две строки.
•	Текст первой строки должен быть: It's a Windows path: "C:\Program Files\Java\jdk-13.0.0\bin"
•	Текст второй строки должен быть: It's a Java string: \"C:\\Program Files\\Java\\jdk-13.0.0\\bin\"
*/

public class JRProTask0909 {
    public static void main(String[] args) {
        System.out.println("It's a Windows path: \"C:\\Program Files\\Java\\jdk-13.0.0\\bin\"");
        System.out.println("It's a Java string: \\\"C:\\\\Program Files\\\\Java\\\\jdk-13.0.0\\\\bin\\\"");
    }
}









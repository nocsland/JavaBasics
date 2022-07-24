package ExercisesFromJavaRush.level10;

/*
StringTokenizer
Используя StringTokenizer раздели query на части по разделителю delimiter.

Пример:
getTokens("java.util.stream", "\\.")
возвращает массив строк
{"java", "util", "stream"}

Hint: решить задачу поможет метод countTokens().

Требования:
•	Нужно, чтобы метод getTokens(String, String) использовал StringTokenizer.
•	Нужно, чтобы метод getTokens(String, String) возвращал массив типа String, заполненный согласно условию задачи.
*/

import java.util.Arrays;
import java.util.StringTokenizer;

public class JRProTask0915 {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer tokenizer = new StringTokenizer(query,delimiter);
        String[] tokens = new String[tokenizer.countTokens()];
        while (tokenizer.hasMoreTokens()){
            tokens[tokens.length - tokenizer.countTokens()] = tokenizer.nextToken();
        }
        return tokens;
    }
}







package ExercisesFromJavaRush.Level4;

/* Диггер (1)
Вывести на экран слои планеты. Для реализации этой задачи используй вложенные циклы for.
Размер слоев: 10*10 символов. Для вывода в консоль используй переменную land.
Требования:
В консоль должен выводится прямоугольник 10*10 состоящий из символов равных символу переменной land.
Переменные класса не изменяй.
*/

public class Ex_JR_pro_task_04_25 {
    public static String bug = "🐛";
    public static String robot = "🤖";
    public static String land = "🌍";
    public static String death = "💀";
    public static String hole = " ";


    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(land);
            }
            System.out.println();
        }
    }
}

package ExercisesFromJavaRush.Level4;

/* Диггер (3)
В этой части Амиго пробирается через все слои планеты к ее ядру, чтобы уничтожить зараженных галабагами роботов. Пробираясь через каждый слой, он оставляет после себя тоннель.

Это значит, что в первых восьми слоях на четвертой позиции должен быть тоннель (переменная hole).
В предпоследнем слое на четвертой позиции должен находится Амиго.
Последний слой состоит из зараженных роботов.

Пример вывода:
🌍🌍🌍 🌍🌍🌍🌍🌍🌍
🌍🌍🌍 🌍🌍🌍🌍🌍🌍
🌍🌍🌍 🌍🌍🌍🌍🌍🌍
🌍🌍🌍 🌍🌍🌍🌍🌍🌍
🌍🌍🌍 🌍🌍🌍🌍🌍🌍
🌍🌍🌍 🌍🌍🌍🌍🌍🌍
🌍🌍🌍 🌍🌍🌍🌍🌍🌍
🌍🌍🌍 🌍🌍🌍🌍🌍🌍
🌍🌍🌍🤖🌍🌍🌍🌍🌍🌍
🐛🐛🐛🐛🐛🐛🐛🐛🐛🐛

Требования:
•	В первых восьми слоях на четвертой позиции должен быть тоннель (переменная hole).
•	Амиго (переменная robot) должен находиться в предпоследнем слое на четвертой позиции.
•	Последний слой должен состоять только из зараженных роботов (переменная bugs).
•	Остальное пространство должно быть заполнено землей (переменная land).
*/

public class Ex_JR_pro_task_04_25_3 {
    public static String bug = "🐛";
    public static String robot = "🤖";
    public static String land = "🌍";
    public static String death = "💀";
    public static String hole = " ";


    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i < 8 && j == 3) {
                    System.out.print(hole);
                } else if (i == 8 && j == 3) {
                    System.out.print(robot);
                } else if (i == 9) {
                    System.out.print(bug);

                } else
                    System.out.print(land);
            }
            System.out.println();
        }
    }
}


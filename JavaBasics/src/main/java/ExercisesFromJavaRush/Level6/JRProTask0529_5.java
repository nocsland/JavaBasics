package ExercisesFromJavaRush.Level6;

/*
Галаксианские роботанки (1)

Пришла пора нанести удар по роботанкам. Для этого нужно наложить массив бомб на поле, и если в ячейках с одинаковыми
индексами массивов fields и bombs находится роботанк и бомба (бомба попала в роботанк), то фиксируем попадание —
записываем в соответствующую ячейку массива field значение переменной hit.
Осталось только перенести вывод массива field на экран так, чтобы было выведено поле уже после "бомбардировки".
Больше ничего выводить не нужно.

Требования:
•	Замени роботанки на "попадания" в соответствующих ячейках массива field (см. условие).
•	Вывод на экран должен соответствовать заданию.
*/

import java.util.Arrays;

public class JRProTask0529_5 {
    public static String robotank = "☖";
    public static String empty = "_";
    public static String hit = "🎯";
    public static int width = 30;
    public static int height = 10;
    public static int bomb = 1;
    public static int noBomb = 0;
    public static String[][] field = new String[height][width];
    public static int[][] bombs = new int[height][width];


    public static void main(String[] args) {
        for (int i = 0; i < field.length; i++) {
            int x = (int) (Math.random() * field[i].length);
            Arrays.fill(field[i], empty);
            Arrays.fill(field[i], x, x + 1, robotank);
        }
        for (int i = 0; i < bombs.length; i++) {
            for (int j = 0; j < bombs[i].length; j++) {
                int y = (int) (Math.random() * field[i].length);
                Arrays.fill(bombs[i], noBomb);
                Arrays.fill(bombs[i], 0, 10, bomb);
            }
        }
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j].equals(robotank) && bombs[i][j] == 1){
                    field[i][j] = hit;
                }

            }

        }
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j] + "");
            }
            System.out.println();

        }
    }
}
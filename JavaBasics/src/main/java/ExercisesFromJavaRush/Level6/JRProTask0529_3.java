package ExercisesFromJavaRush.Level6;

/*
Галаксианские роботанки (1)
Теперь займемся бомбами. Идея "бомбардировки" такова — каждая бомба попадает в соответствующую ячейку поля.
Создадим массив чисел (публичная статическая переменная bombs типа int[][]) такой же размерности как и у поля (field),
который будет содержать числа:

0 — в ячейке нет бомбы;
1 — в ячейке есть бомба.
Заполни массив бомбами так, чтобы в каждой строке было 10 бомб.
Требования:
•	В классе Solution должна быть публичная статическая переменная bombs типа int[][], проинициализированная при
    объявлении двумерным массивом с размерностью width*height.
•	В методе main класса Solution массив bombs должен быть заполнен элементами согласно условию.
*/

import java.util.Arrays;

public class JRProTask0529_3 {
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
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j] + "");
            }
            System.out.println();

        }
        for (int i = 0; i < bombs.length; i++) {
            for (int j = 0; j < bombs[i].length; j++) {
                int y = (int) (Math.random() * field[i].length);
                Arrays.fill(bombs[i], noBomb);
                Arrays.fill(bombs[i], 0, 10, bomb);
            }
        }
    }
}
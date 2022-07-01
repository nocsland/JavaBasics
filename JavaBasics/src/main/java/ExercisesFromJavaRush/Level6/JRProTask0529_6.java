package ExercisesFromJavaRush.Level6;

/*
Галаксианские роботанки (5)
Судя по результату "бомбардировки", не все роботанки были уничтожены. Давай допишем программу таким образом, чтобы
"бомбардировки" продолжались до тех пор, пока не будут уничтожены все роботанки.
Обрати внимание, что делать "бомбардировку" с тем же расположением бомб бессмысленно.

В результате работы программы должен быть выведен в консоль массив field (один раз), в котором нет ни одного "живого"
роботанка.

Требования:
•	"Бомбардировки" должны продолжаться до тех пор, пока в массиве field не останется ни одного роботанка.
•	Массив field должен быть выведен на экран после всех "бомбардировок".
*/

import java.util.Arrays;

public class JRProTask0529_6 {
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
        int tankCount = 10;

        while (tankCount > 0) {
            for (int i = 0; i < bombs.length; i++) {
                int bombCount = 10;
                while (bombCount > 0) {
                    int j = (int) (Math.random() * width);
                    if (bombs[i][j] == noBomb) {
                        bombs[i][j] = bomb;
                        bombCount--;
                    }
                }
            }
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[i].length; j++) {
                    if (bombs[i][j] == 1 && field[i][j].equals(robotank)) {
                        field[i][j] = hit;
                        tankCount--;
                    }

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
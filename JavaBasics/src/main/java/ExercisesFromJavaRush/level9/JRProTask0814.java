package ExercisesFromJavaRush.level9;

/*
Флаги
setFlag(int number, int flagPos) — устанавливает значение "1" биту под индексом flagPos числа number и возвращает новое
значение.
resetFlag(int number, int flagPos) — устанавливает значение "0" биту под индексом flagPos числа number и возвращает
новое значение.
checkFlag(int number, int flagPos) — проверяет значение бита под индексом flagPos числа number и возвращает true, если
значение "1" и false, если "0".

Требования:
Реализуй метод setFlag(int, int) согласно условию.
Реализуй метод resetFlag(int, int) согласно условию.
Реализуй метод checkFlag(int, int) согласно условию.

Подсказка для меня:
Установка флага, т.е. 1:  number | (1 << bit)
Снятие флага, т.е. 0: number & ~(1 << bit)
Проверка установленного флага (number & (1 << bit)) == (1 << bit)
*/

public class JRProTask0814 {

    public static int setFlag(int number, int flagPos) {
        return number | (1 << flagPos);
    }

    public static int resetFlag(int number, int flagPos) {
        return number & ~(1 << flagPos);
    }

    public static boolean checkFlag(int number, int flagPos) {
        return (number & (1 << flagPos)) == (1 << flagPos);
    }
}








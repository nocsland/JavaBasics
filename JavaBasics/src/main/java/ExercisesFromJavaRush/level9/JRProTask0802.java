package ExercisesFromJavaRush.level9;

/*
Утильный класс: часть 2
Исправь методы класса Solution, используя класс Math:

sqrt(double) — должен возвращать квадратный корень переданного аргумента.
cbrt(double) — должен возвращать кубический корень переданного аргумента.
pow(int, int) — должен возвращать значение первого аргумента, возведенного в степень второго аргумента.
Требования:
•	Реализуй метод sqrt(double) согласно условию.
•	Реализуй метод cbrt(double) согласно условию.
•	Реализуй метод pow(int, int) согласно условию.
*/

public class JRProTask0802 {

    public static double sqrt(double a) {
        return Math.sqrt(a);
    }

    public static double cbrt(double a) {
        return Math.cbrt(a);
    }

    public static double pow(int number, int power) {
        return Math.pow(number, power);
    }
}








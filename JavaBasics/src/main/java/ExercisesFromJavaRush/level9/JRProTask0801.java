package ExercisesFromJavaRush.level9;

/*
Утильный класс: часть 1
Реализуй методы sin(double), cos(double), tan(double) которые возвращают синус, косинус и тангенс угла соответственно,
полученного как параметр. Угол задан в градусах.
В этом тебе помогут соответствующие методы класса Math, которые принимают параметром угол, заданный в радианах.

Требования:
•	Реализуй метод sin(double) согласно условию.
•	Реализуй метод cos(double) согласно условию.
•	Реализуй метод tan(double) согласно условию.
*/

public class JRProTask0801 {

    public static double sin(double a) {
        return Math.sin(Math.toRadians(a));
    }

    public static double cos(double a) {
        return Math.cos(Math.toRadians(a));

    }

    public static double tan(double a) {
        return Math.tan(Math.toRadians(a));

    }
}







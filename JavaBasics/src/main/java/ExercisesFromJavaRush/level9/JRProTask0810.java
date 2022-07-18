package ExercisesFromJavaRush.level9;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeUnit.*;

/*
Таймер
В классе Solution реализуй метод setTimer(int, int, int, int, int), который засыпает на определенное время, используя
соответствующие методы java.util.concurrent.TimeUnit.

Требования:
•	Метод setTimer(int, int, int, int, int) должен быть реализован согласно условию.
*/

public class JRProTask0810 {

    public static void setTimer(int days, int hours, int minutes, int seconds, int millis) throws InterruptedException {
        System.out.println("Таймер запущен!");
        TimeUnit.DAYS.sleep(days);
        TimeUnit.HOURS.sleep(hours);
        TimeUnit.MINUTES.sleep(minutes);
        TimeUnit.SECONDS.sleep(seconds);
        TimeUnit.MILLISECONDS.sleep(millis);
        System.out.println("♬ ♪ ♬♬♬♬ ♪♪♪♪");
    }
}








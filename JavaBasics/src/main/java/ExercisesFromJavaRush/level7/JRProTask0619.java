package ExercisesFromJavaRush.level7;

/*
Замок чернобайта
Создай метод String destroyDeadMan(String), который будет принимать на вход "имя" мертвеца и возвращать фразу "<имя>
был уничтожен", где <имя> — значение аргумента метода destroyDeadMan.
В методе main вызови метод destroyDeadMan(String) для каждого мертвеца из списка deadMen, результат вызова выведи на
экран.

Требования:
•	В классе Solution должна быть публичная статическая переменная String[] deadMen, проинициализированная при
    объявлении.
•	В классе Solution должен быть создан public static метод destroyDeadMan() с параметром типа String и возвращаемым
    значением типа String.
•	Вызов метода destroyDeadMan(String) должен возвращать строку согласно условию.
•	В методе main должен быть вызван метод destroyDeadMan(String) для каждого элемента массива deadMen с выводом
    результата на экран.
*/

public class JRProTask0619 {
    public static String[] deadMen = {"мертвец_1", "мертвец_2", "мертвец_3", "мертвец_4", "мертвец_5",
            "мертвец_6", "мертвец_7", "мертвец_8", "мертвец_9", "мертвец_10"};

    public static void main(String[] args) {
        for (String s : deadMen) {
            System.out.println(destroyDeadMan(s));

        }
    }

    public static String destroyDeadMan(String string) {
        return string + " был уничтожен";
    }
}





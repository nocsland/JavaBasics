package ExercisesFromJavaRush.level7;

/*
Злобный призрак
Создай метод switchSword(String) с параметром типа String, который будет выводить фразу "Меч переключен в <параметр> режим.",где <параметр> — значение аргумента метода switchSword.
Вызови метод switchSword() с нужным параметром и в нужном месте метода main. Остальной код метода main не изменяй.

Требования:
•	В классе Solution должен быть создан public static void метод switchSword() с параметром типа String.
•	Вызов метода switchSword(String) должен выводить в консоль фразу согласно условию.
•	В методе main должен быть вызван метод switchSword(String) в нужном месте с нужным параметром. Остальной код метода main изменять нельзя.
*/

public class JRProTask0618 {
    public static String material= "материальный";
    public static String immaterial= "нематериальный";

    public static void main(String[] args) {
        System.out.println("Из болота вылез нематериальный монстр...");

        switchSword(immaterial);
    }
    public static void switchSword( String typeSword){
        System.out.println("Меч переключен в " + typeSword + " режим.");

    }
}





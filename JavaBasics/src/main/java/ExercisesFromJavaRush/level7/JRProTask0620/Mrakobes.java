package ExercisesFromJavaRush.level7.JRProTask0620;

public class Mrakobes {
    private static boolean isAlive = true;

    //напишите тут ваш код

    public static void printState() {
        System.out.println("Амиго" + (isAlive ? " НЕ " : " ") + "победил Мракобеса Безумного");
    }
    public static void setIsAlive(boolean alive){
        isAlive = alive;
    }
}

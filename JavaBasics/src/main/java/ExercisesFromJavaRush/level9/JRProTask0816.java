package ExercisesFromJavaRush.level9;

/*
Приоритеты
Внеси исправления в метод main(), чтобы он выводил в консоли число 12.

Требования:
•	В методе main() расставь одну пару скобок так, чтобы в консоли вывелось число 12. Остальной код не изменяй.
•	Метод main() должен выводить число
*/

public class JRProTask0816 {

    public static void main(String[] args) {
        int number = 2;
        System.out.println(number + number * (number + ++number));
    }

}










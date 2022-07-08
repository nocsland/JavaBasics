package ExercisesFromJavaRush.level7.JRProTask0620;
/*
Мракобес Безумный
Для того, чтобы получить доступ к приватной переменной isAlive класса Mrakobes, создай в этом классе публичный
статический метод void setIsAlive(boolean), который будет принимать на вход значение true или false и присваивать это
значение переменной isAlive класса Mrakobes.
Вызови этот метод с нужным значением в методе main вместо обращения к приватной переменной. Также исправь ошибку с
вызовом метода printState.

Подсказка: тут тоже не обошлось без модификатора доступа.

Требования:
•	В классе Mrakobes должна быть приватная статическая переменная isAlive типа boolean, проинициализированная при
объявлении значением true.
•	В классе Mrakobes должен быть создан public static метод void setIsAlive() с параметром типа boolean.
•	Вызов метода setIsAlive(boolean) должен присваивать переданное значение переменной isAlive класса Mrakobes.
•	В методе main класса Solution должен быть вызван метод setIsAlive(boolean) с нужным параметром.
•	Модификатор доступа метода printState класса Mrakobes должен быть изменен на public.
•	В методе main класса Solution должен быть вызван метод printState().
•	В результате работы программы в консоль должна быть выведена фраза "Амиго победил Мракобеса Безумного".
*/

public class Solution {
    public static void main(String[] args) {
        Mrakobes.setIsAlive(false);
        Mrakobes.printState();
    }
}
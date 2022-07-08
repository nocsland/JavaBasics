package ExercisesFromJavaRush.level7.JRProTask0622;

/*
Диабло (1)
Давайте поможем Амиго победить Диабло. Для этого напишем программу, в которой они сразятся друг с другом.

Для начала Диабло нужно будет обнаружить, для этого мы сгенерируем ему случайную позицию (число от 1 до 4), а потом
будем угадывать в какой позиции он находится. После того, как Диабло будет найден, нужно будет сразиться с ним. Для
этого у Амиго и Диабло будет по 9 "жизней" (прям как у котов). Амиго будет атаковать, а Диабло — защищаться.
Но если Диабло защитился, то он сразу же наносит Амиго ответный удар (Амиго теряет "жизнь"). Если же Диабло не
защитился, то он теряет 3 "жизни". Атака и защита происходит рандомно в одной из трех зон (верх/середина/низ, но для
простоты будем использовать числа от 1 до 3). Ход боя и результат будут выводиться на экран в реальном времени.
Чтобы не было сложно, разобьем эту задачу на 4 этапа.

В этой (первой) части нужно в класс Solution добавить публичную статическую переменную (поле) diabloPosition типа int,
в которой будет храниться позиция Диабло. В методе main присвой этой перенной случайное значение от 1 до 4. Для этого
воспользуйся уже реализованным методом getRandomNumber(int), передав в него верхнюю границу диапазона — число 4.
Далее в классе Solution создай публичный статический метод void findDiablo(), в котором сначала выведи на экран
значение переменной getFirstPositionPhrase, а потом считывай с клавиатуры числа до тех пор, пока не будет угадана
позиция Диабло. При этом если позиция не угадана, то выведи фразу — значение переменной getPositionPhrase, а если
угадали, то значение переменной findDiabloPhrase. Вызови метод findDiablo в методе main после присвоения значения
переменной diabloPosition.

Требования:
•	В классе Solution должна быть публичная статическая переменная diabloPosition типа int.
•	В методе main класса Solution переменной diabloPosition должно быть присвоено значение - результат работы метода
    getRandomInt с аргументом 4.
•	В классе Solution должен быть публичный статический метод void findDiablo().
•	Вызов метода findDiablo() должен считывать значения с клавиатуры до тех пор, пока не будет введено значение равное
    значению переменной diabloPosition.
•	Метод findDiablo() класса Solution должен выводить в консоль значения переменных getFirstPositionPhrase,
    getPositionPhrase и findDiabloPhrase.
•	В методе main класса Solution должен быть вызван метод findDiablo().
*/

import java.util.Scanner;

public class Task0622_1 {
    public static String getFirstPositionPhrase = "Помоги Амиго определить, где спрятался Диабло? Введи номер позиции (1, 2, 3 или 4):";
    public static String getPositionPhrase = "Диабло не обнаружен. Давай попробуем снова. Введи номер позиции (1, 2, 3 или 4):";
    public static String findDiabloPhrase = "Амиго обнаружил Диабло.";
    public static String diabloDefendPhrase = "Амиго атакует. Диабло отбил атаку Амиго и нанес ответный удар.";
    public static String amigoAttackPhrase = "Удар Амиго достиг цели. Диабло потерял 3 жизни.";
    public static String winPhrase = "Амиго одержал победу над Диабло и выбил из его головы загадочный кристалл.";
    public static String loosePhrase = "Диабло победил Амиго.";
    public static int diabloPosition;


    public static void main(String[] args) {
        diabloPosition = getRandomNumber(4);
        findDiablo();
    }

    public static int getRandomNumber(int range) {
        return (int) (Math.random() * range) + 1;
    }
    public static void findDiablo(){
        System.out.println(getFirstPositionPhrase);
        Scanner scanner = new Scanner(System.in);
        int position;
        do {
            position = scanner.nextInt();
            if (position != diabloPosition){
                System.out.println(getPositionPhrase);
            }else System.out.println(findDiabloPhrase);
        } while (position != diabloPosition);
    }
}

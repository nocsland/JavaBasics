package ExercisesFromJavaRush.level7.JRProTask0622;

/*
Диабло (4)
Амиго сразился с Диабло, осталось определить — победил Амиго или нет. Для этого создадим публичный статический метод
isAmigoWin(), который будет возвращать true, если Амиго победил, и false в противном случае.
Далее в методе main вызовем метод isAmigoWin. Если метод вернул true, то нужно вывести в консоль фразу из переменной
winPhrase, иначе — вывести фразу из переменной loosePhrase.

Требования:
•	В классе Solution должен быть публичный статический метод isAmigoWin(), который возвращает значение типа boolean.
•	Метод isAmigoWin() должен возвращать true, если у Диабло нет "жизней" или false, если Диабло жив.
•	В методе main нужно вызвать метод isAmigoWin() после вызова метода battle().
•	Если метод isAmigoWin() вернул true, то нужно вывести в консоль фразу из переменной winPhrase, иначе вывести фразу
    из переменной loosePhrase.
*/

import java.util.Scanner;

public class Task0622_4 {
    public static String getFirstPositionPhrase = "Помоги Амиго определить, где спрятался Диабло? Введи номер позиции (1, 2, 3 или 4):";
    public static String getPositionPhrase = "Диабло не обнаружен. Давай попробуем снова. Введи номер позиции (1, 2, 3 или 4):";
    public static String findDiabloPhrase = "Амиго обнаружил Диабло.";
    public static String diabloDefendPhrase = "Амиго атакует. Диабло отбил атаку Амиго и нанес ответный удар.";
    public static String amigoAttackPhrase = "Удар Амиго достиг цели. Диабло потерял 3 жизни.";
    public static String winPhrase = "Амиго одержал победу над Диабло и выбил из его головы загадочный кристалл.";
    public static String loosePhrase = "Диабло победил Амиго.";
    public static int diabloPosition;
    public static int amigoLives = 9;
    public static int diabloLives = 9;

    public static void main(String[] args) {
        diabloPosition = getRandomNumber(4);
        findDiablo();
        battle();
        isAmigoWin();
        if(isAmigoWin()){
            System.out.println(winPhrase);
        }else System.out.println(loosePhrase);
    }

    public static int getRandomNumber(int range) {
        return (int) (Math.random() * range) + 1;
    }

    public static void findDiablo() {
        System.out.println(getFirstPositionPhrase);
        Scanner scanner = new Scanner(System.in);
        int position;
        do {
            position = scanner.nextInt();
            if (position != diabloPosition) {
                System.out.println(getPositionPhrase);
            } else System.out.println(findDiabloPhrase);
        } while (position != diabloPosition);
    }

    public static void amigoLostLife() {
        amigoLives -= 1;

    }

    public static void diabloLostLife() {
        diabloLives -= 3;
    }
    public static void battle(){
        while (amigoLives > 0 && diabloLives > 0){
            if (amigoAttacks() == diabloDefends()){
                System.out.println(diabloDefendPhrase);
                amigoLostLife();
            } else {
                System.out.println(amigoAttackPhrase);
                diabloLostLife();
            }

        }
    }

    public static int amigoAttacks() {
        return getRandomNumber(3);
    }

    public static int diabloDefends() {
        return getRandomNumber(3);
    }

    public static boolean isAmigoWin(){
        return diabloLives <= 0;
    }
}




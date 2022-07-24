package ExercisesFromJavaRush.level10;

/*
Двоично-шестнадцатеричный конвертер
Публичный статический метод toHex(String) должен переводить строковое представление двоичного числа, полученное в качестве входящего параметра, из двоичной системы счисления в шестнадцатеричную и возвращать его строковое представление. А публичный статический метод toBinary(String) наоборот — из строкового представления шестнадцатеричного числа в строковое представление двоичного числа.

Методы работают только с не пустыми строками.
Если входящий параметр — пустая строка или null, то оба метода возвращают пустую строку.
Если входящий параметр метода toHex(String) содержит любой символ, кроме 0 или 1, то метод возвращает пустую строку.
Если входящий параметр метода toBinary(String) содержит любой символ, кроме цифр от 0 до 9 или латинскую букву от a до f (в нижнем регистре), то метод возвращает пустую строку.

Твоя задача — реализовать эти методы.

Один из алгоритмов перевода строкового представления двоичного числа в строковое представление шестнадцатеричного числа следующий:

Проверяем длину строки, полученной входящим параметром. Она должна быть кратна 4.
Если это не так, то добавляем нужное количество 0 в начало строки.
Берем каждые четыре символа (бита) и проверяем, какому символу шестнадцатеричной кодировки он соответствует.
Например:

двоичное представление — "100111010000", где "1001" — "9", "1101" — "d", "0000" — "0",
шестнадцатеричное представление — "9d0".
Один из алгоритмов перевода строкового представления шестнадцатеричного числа в строковое представление двоичного числа
следующий:
Берем каждый символ и проверяем какому двоичному числу (4 бита) он соответствует.

Например:

шестнадцатеричное представление — "9d0", где "9" — "1001", "d" — "1101", "0" — "0000",
двоичное представление — "100111010000".
Метод main() не принимает участие в тестировании.

Требования:
•	Нужно, чтобы метод toHex(String) был реализован согласно условию.
•	Нужно, чтобы метод toBinary(String) был реализован согласно условию.
•	Методы Integer.toBinaryString(int) и Long.toBinaryString(int) использовать нельзя.
•	Методы Integer.toHexString(int) и Long.toHexString(int) использовать нельзя.
•	Методы Integer.parseInt(String, int) и Long.parseLong(String, int) использовать нельзя.
•	Методы Integer.toString(int, int) и Long.toString(long, int) использовать нельзя.
•	Объект типа BigInteger использовать нельзя.
•	Объект типа BigDecimal использовать нельзя.
*/

public class JRProTask0908 {

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        String hexNumber = "";
        if (binaryNumber == null || binaryNumber.equals("") || binaryNumber.matches("[^01]")) {
            return hexNumber;
        }

        int remain = binaryNumber.length() % 4;
        if (remain == 0) {
            binaryNumber = binaryNumber;
        } else {
            StringBuilder zeroString = new StringBuilder();
            for (int i = remain; i < 4; i++) {
                zeroString.append("0");
            }
            binaryNumber = zeroString + binaryNumber;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < binaryNumber.length(); i += 4) {
            String substring = binaryNumber.substring(i, i + 4);
            String element = "";
            switch (substring) {
                case ("0000"):
                    element = "0";
                    break;
                case ("0001"):
                    element = "1";
                    break;
                case ("0010"):
                    element = "2";
                    break;
                case ("0011"):
                    element = "3";
                    break;
                case ("0100"):
                    element = "4";
                    break;
                case ("0101"):
                    element = "5";
                    break;
                case ("0110"):
                    element = "6";
                    break;
                case ("0111"):
                    element = "7";
                    break;
                case ("1000"):
                    element = "8";
                    break;
                case ("1001"):
                    element = "9";
                    break;
                case ("1010"):
                    element = "a";
                    break;
                case ("1011"):
                    element = "b";
                    break;
                case ("1100"):
                    element = "c";
                    break;
                case ("1101"):
                    element = "d";
                    break;
                case ("1110"):
                    element = "e";
                    break;
                case ("1111"):
                    element = "f";
                    break;
            }
            result.append(element);
        }
        return result.toString();
    }

    public static String toBinary(String hexNumber) {
        String decimalNumber = "";
        if (hexNumber == null || hexNumber.equals("") || hexNumber.matches("[^/D,a-f]")) {
            return decimalNumber;
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < hexNumber.length(); i++) {
            String element = "";
            switch (hexNumber.charAt(i)) {
                case ('0'):
                    element = "0000";
                    break;
                case ('1'):
                    element = "0001";
                    break;
                case ('2'):
                    element = "0010";
                    break;
                case ('3'):
                    element = "0011";
                    break;
                case ('4'):
                    element = "0100";
                    break;
                case ('5'):
                    element = "0101";
                    break;
                case ('6'):
                    element = "0110";
                    break;
                case ('7'):
                    element = "0111";
                    break;
                case ('8'):
                    element = "1000";
                    break;
                case ('9'):
                    element = "1001";
                    break;
                case ('a'):
                    element = "1010";
                    break;
                case ('b'):
                    element = "1011";
                    break;
                case ('c'):
                    element = "1100";
                    break;
                case ('d'):
                    element = "1101";
                    break;
                case ('e'):
                    element = "1110";
                    break;
                case ('f'):
                    element = "1111";
                    break;
            }
            result.append(element);
        }
        return result.toString();
    }
}








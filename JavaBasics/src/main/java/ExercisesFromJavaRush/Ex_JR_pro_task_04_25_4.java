package ExercisesFromJavaRush;

/* Диггер (4)
Наконец Амиго добрался до ядра планеты. Осталось дело за малым — уничтожить зараженных галабагами роботов.
Чтобы отобразить в последнем слое уничтоженного робота, используй переменную death вместо bug.

Пример вывода:
🌍🌍🌍 🌍🌍🌍🌍🌍🌍
🌍🌍🌍 🌍🌍🌍🌍🌍🌍
🌍🌍🌍 🌍🌍🌍🌍🌍🌍
🌍🌍🌍 🌍🌍🌍🌍🌍🌍
🌍🌍🌍 🌍🌍🌍🌍🌍🌍
🌍🌍🌍 🌍🌍🌍🌍🌍🌍
🌍🌍🌍 🌍🌍🌍🌍🌍🌍
🌍🌍🌍 🌍🌍🌍🌍🌍🌍
🌍🌍🌍 🌍🌍🌍🌍🌍🌍
💀💀💀💀💀💀💀💀💀💀

Требования:
В первых девяти слоях на четвертой позиции должен быть тоннель (переменная hole).
Амиго не должен находиться ни в каком слое.
Последний слой должен состоять только из уничтоженных роботов (переменная death).
*/

public class Ex_JR_pro_task_04_25_4 {
    public static String bug = "🐛";
    public static String robot = "🤖";
    public static String land = "🌍";
    public static String death = "💀";
    public static String hole = " ";


    public static void main(String[] args) {
        for (int i=0; i<10; i++){
            for(int j = 0; j<10;j++){
                if (i < 9 && j == 3){
                    System.out.print(hole);
                }
                else if (i == 9){
                    System.out.print(death);
                }else
                    System.out.print(land);
            }System.out.println();
        }
    }
}


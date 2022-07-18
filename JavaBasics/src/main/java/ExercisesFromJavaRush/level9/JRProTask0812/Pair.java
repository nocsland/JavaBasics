package ExercisesFromJavaRush.level9.JRProTask0812;

public class Pair {
    private int x;
    private int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("x=%d, y=%d", x, y);
    }

    public void swap() {
        int a = x ^ y;
        x = a ^ x;
        y = a ^ y;
    }
}

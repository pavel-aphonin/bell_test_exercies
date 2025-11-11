package Task_4;

public class Main {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(5);
        int[][] mat = matrix.generator();
        Matrix.printer(mat);
    }
}

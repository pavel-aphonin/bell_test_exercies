package Task_4;

public class Matrix {
    private final int N;

    public Matrix(int size) {
        this.N = size;
    }

    public int[][] generator() {
        int S = 2 + 2 * this.N;
        int[][] m = new int[S][S];

        int c1 = N;
        int c2 = N + 1;

        for (int i = 0; i < S; i++) {
            for (int j = 0; j < S; j++) {
                int rowDist = Math.min(Math.abs(i - c1), Math.abs(i - c2));
                int colDist = Math.min(Math.abs(j - c1), Math.abs(j - c2));
                m[i][j] = Math.max(rowDist, colDist);
            }
        }
        return m;
    }

    public static void printer(int[][] m) {
        for (int[] row : m) {
            for (int v : row) {
                System.out.printf("%2d ", v);
            }
            System.out.println();

        }
    }
}
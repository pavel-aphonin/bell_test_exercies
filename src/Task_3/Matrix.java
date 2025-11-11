package Task_3;

public class Matrix {

    private final int[][] matrix;

    public Matrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int findMin() {
        int min = matrix[0][matrix.length - 1];

        for (int i = 0; i <= matrix.length - 1; i += 1) {
            for (int j = matrix.length - 1; j >= 0; j -= 1) {
                if (i == j) {
                    continue;
                }

                if (i + j != matrix.length - 1) {
                    continue;
                }

                if (matrix[i][j] < min) {
                    min = matrix[i][j];

                }
            }
        }

        return min;
    }
}
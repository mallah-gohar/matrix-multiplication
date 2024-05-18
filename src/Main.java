public class Main {
    public static int[][] multiplyMatrices(int[][] firstMatrix, int[][] secondMatrix) {
        int rowsFirst = firstMatrix.length;
        int columnsFirst = firstMatrix[0].length;
        int columnsSecond = secondMatrix[0].length;

        // Result matrix will have the number of rows of the first matrix and the number of columns of the second matrix
        int[][] result = new int[rowsFirst][columnsSecond];

        // Perform matrix multiplication
        for (int i = 0; i < rowsFirst; i++) {
            for (int j = 0; j < columnsSecond; j++) {
                for (int k = 0; k < columnsFirst; k++) {
                    result[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }

        return result;
    }
    // Method to print a matrix
public static void printMatrix(int[][] matrix) {
    for (int[] row : matrix) {
        for (int element : row) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
public static void main(String[] args) {
    // Example matrices
    int[][] firstMatrix = {
            {1, 2, 3},
            {4, 5, 6}
    };

    int[][] secondMatrix = {
            {7, 8},
            {9, 10},
            {11, 12}
    };

    // Multiply matrices
    int[][] result = multiplyMatrices(firstMatrix, secondMatrix);

    // Print the result
    System.out.println("Result of matrix multiplication:");
    printMatrix(result);
}
    
}

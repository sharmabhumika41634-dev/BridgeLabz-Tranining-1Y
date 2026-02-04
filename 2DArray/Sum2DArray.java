class Sum2DArray {
    public static void main(String[] args) {

        int[][] a = {
            {1, 2},
            {3, 4}
        };

        // Row-wise sum
        for (int i = 0; i < 2; i++) {
            int rowSum = 0;
            for (int j = 0; j < 2; j++) {
                rowSum += a[i][j];
            }
            System.out.println("Sum of row " + (i + 1) + " = " + rowSum);
        }

        // Column-wise sum
        for (int j = 0; j < 2; j++) {
            int colSum = 0;
            for (int i = 0; i < 2; i++) {
                colSum += a[i][j];
            }
            System.out.println("Sum of column " + (j + 1) + " = " + colSum);
        }
    }
}

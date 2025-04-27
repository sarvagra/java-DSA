// find the product of two matrices

public class matrix_multiplication {
    public static void main(String[] args) {
        int[][] a = {
            {1, 0, 1},
            {1, 2, 0},
            {0, 0, 1}
        };
        
        int[][] b = {
            {0, 0, 1},
            {0, 1, 2},
            {1, 1, 0}
        };
        
        int[][] c = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int res = 0;
                for (int k = 0; k < a[0].length; k++) {
                    res += a[i][k] * b[k][j];
                }
                c[i][j] = res;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class matrix_transpose {
    public static void main(String[] args) {
        int[][] a = { {1, 3}, {5, 6} }; 
        int [][] b = new int [2][2];
        
        // loop to transpose the matrix a 
        for(int i= 0; i<=1; i++){    
            for(int j =0; j<=1; j++){
                b[j][i]= a[i][j];
            }
        }
        // loop to print the transpose of matrix a 
        for(int i= 0; i<=1; i++){
            for(int j =0; j<=1; j++){
                System.out.print(b[i][j]);
            }System.out.println();
        }
    }
}
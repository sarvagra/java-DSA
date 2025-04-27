// rotate a matrix by 90° clockkwise

public class rotate_matrix {
    public static void main(String[] args) {
        int[][] a = { {1, 3}, {5, 6} }; 
        int [][] b = new int [2][2];
        int temp,m;
        
        // loop to transpose the matrix a and store in b
        for(int i= 0; i<=1; i++){    
            for(int j =0; j<=1; j++){
                b[j][i]= a[i][j];
            }
        }
        // loop to reverse the rows of b  
        for(int i=0; i<=1; i++){
            m=b[0].length-1;
            for(int j=0; j<=m;j++){
                temp=b[i][j];
                b[i][j]=b[i][m];
                b[i][m]=temp;
            }
        }
        
        // loop to print the rotated matrix 
        for(int i= 0; i<=1; i++){    
            for(int j =0; j<=1; j++){
                System.out.print(b[i][j]);
            }System.out.println();
        }
    }
}

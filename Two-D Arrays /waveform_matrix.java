// program to print a matrix in wave-form 

public class waveform_matrix{
    public static void main(String[] args) {
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] b= new int [3][3];
        int temp,m;

        for(int i =0; i<=2;i++){
            
            if(i%2!=0){
                m=a[0].length-1;
                for(int j=0;j<=2;j++){
                    temp=a[i][j];
                    a[i][j]=a[i][m];
                    a[i][m]=temp;
                    m--;
                    if(m==i) break;
                }
            }
            }
        
        for(int i=0;i<=a[0].length-1;i++){
            for(int j=0; j<=a[0].length-1;j++){
                System.out.print(a[i][j]+" ");
            }
        }
    }
}
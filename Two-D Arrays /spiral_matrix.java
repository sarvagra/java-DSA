// program to print a matrix in spiral form

public class spiral_matrix {
    public static void main(String[] args) {
        int a[][]= {{1,0,9,5},
                    {2,3,5,9},
                    {0,4,7,8},
                    {2,7,6,9}};
        int maxr=a.length-1; 
        int maxc=a[0].length-1;
        int minr=0;
        int minc=0;

        while(minc<=maxc && minr<=maxr){
            // left to right
            for(int j=minc;j<=maxc;j++){
                System.out.print(a[minr][j]+" ");
            } minr++;
            
            // up to down
            if(minc>maxc || minr>maxr) break;
            for(int i=minr; i<=maxr;i++){
                System.out.print(a[i][maxr]+" ");
            } maxc--;

            // right to left
            if(minc>maxc || minr>maxr) break;
            for(int j= maxc; j>=minc;j--){
                System.out.print(a[maxr][j]+" ");
            }maxr--;

            // down to up
            if(minc>maxc || minr>maxr) break;
            for(int i=maxr;i>=minr;i--){
                System.out.print(a[i][minc]+" ");
            }minc++;
        }
    }
}

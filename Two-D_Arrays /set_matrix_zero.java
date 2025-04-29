public class set_matrix_zero {
    public static void main(String[] args) {
        int a[][]={{1,1,23,33},{9,6,9,23},{11,56,1,9},{6,2,7,0}};
        boolean zero_row=false;
        boolean zero_col=false;
        //check if zero row or col has zero
        for(int i=0;i<a.length;i++){
            if(a[i][0]==0){
                zero_col=true;
                break;
            }
        }
        for(int j=0;j<a[0].length;j++){
             if(a[0][j]==0){
                zero_row=true;
                break;
            }
        }
        // mark the rows and columns 

        for(int i=1;i<a.length;i++){
            for(int j=1;j<a[0].length;j++){
                if(a[i][j]==0){
                    a[i][0]=0;
                    a[0][j]=0;
                }
            }
        }
        
        
        for(int i=1;i<a.length;i++){
            if(a[i][0]==0){   //make columns zero
                for(int j=1;j<a[0].length;j++){
                    a[i][j]=0;
                }
            }
            if(a[0][i]==0){   //make rows zero
                for(int j=1;j<a[0].length;j++){
                    a[j][i]=0;
                }
            }
        }

        // now set zero rows and columns as zero if required
        
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(zero_col==true)
                    a[j][0]=0;
                if(zero_row==true)
                    a[0][j]=0;
            }
        }

        // print the output
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                System.out.print(a[i][j]+" ");
            }System.out.println();
        }
    }
}



       
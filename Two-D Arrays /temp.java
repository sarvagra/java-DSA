public class temp {
    public static void main(String[] args) {
        int[][] a = { {1, 3}, {5, 6} }; 
        int [][] b = new int [2][2];
        int temp,m=1;

        for(int i=0; i<=1; i++){
            m=1;
            for(int j=0; j<=m;j++){
                temp=a[i][j];
                a[i][j]=a[i][m];
                a[i][m]=temp;
            }
        }
        for(int i=0; i<=1; i++){
            m=1;
            for(int j=0; j<=1;j++){
                System.out.print(a[i][j]);
            }System.out.println();
        }

    }
}
 //mark zeroes in zero column and zero rows 
 for(int i=1;i<a.length;i++){
    for(int j=1;j<a[0].length;j++){
        if(a[i][j]==0){
            a[0][j]=0;
            a[i][0]=0;
        }
    }
}

for(int i=1;i<a.length;i++){
    // turn columns zero
    if(a[0][i]==0){
        for(int j= 1;j<a[0].length;j++){
            a[i][j]=0;
        }
    }
    //turn rows zero
    if(a[i][0]==0){
        for(int j=1;j<a[0].length;j++){
            a[j][i]=0;
        }
    }
}    

// set zero rows and columns 
for(int i=0;i<a.length;i++){
    if(zero_row==true)
        for(int j=0;j<a[0].length;j++)
            a[i][j]=0;
}

for(int i=0;i<a.length;i++){
    if(zero_col==true)
        for(int j=0;j<a[0].length;j++)
            a[j][i]=0;
}

//print the output 


    
}
}


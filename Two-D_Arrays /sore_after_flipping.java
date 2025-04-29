public class sore_after_flipping {
    public static void main(String[] args) {
        int a[][]={{0,1,1,0},{1,1,0,0},{0,1,0,1}};
        // row check 
        for(int i=0;i<a.length;i++){ 
            if(a[i][0]==0){
                for(int j=0;j<a[0].length;j++){ 
                    if(a[i][j]==0)
                        a[i][j]=1;
                    
                    else 
                        a[i][j]=0;

                }
                    
             }
        }
        // column check
        int n_zero=0;
        int n_one=0;
        for (int j=1;j<a[0].length;j++){
            for(int i=0;i<a.length;i++){
                if(a[i][j]==0) n_zero++;
                else n_one++;
            }
            if(n_zero>n_one){
                for(int i=0;i<a.length;i++){
                    if(a[i][j]==0)
                    a[i][j]=1;
                    else 
                    a[i][j]=0;
    
                }
            }
        }
        int score=0;
        int x=1;
        for(int j=a[0].length-1;j>=0;j--){
            for(int i=0;i<a.length;i++){
                score=score+a[i][j]*x;
            }
            x=x*2;
        }System.out.println(score);
    }
        
}



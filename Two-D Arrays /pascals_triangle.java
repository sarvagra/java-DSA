// generate pascals triangle for number of rows=5 using ArrayLists
import java.util.ArrayList;

public class pascals_triangle {
    public static void main(String[] args) {
        ArrayList <ArrayList<Integer>> ls= new ArrayList<>();
        for(int i=0; i<5;i++){
            ArrayList<Integer> ele = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    ele.add(1);
                }
                else {
                    ele.add(ls.get(i-1).get(j)+ls.get(i-1).get(j-1));
                }
            }
            ls.add(ele);
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<ls.get(i).size();j++){
                System.out.print(ls.get(i).get(j));
            }System.out.println();
        }
    }
}

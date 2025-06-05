
// find the most frequent character in a string without space

import java.util.Arrays;

public class sb_max_occurance {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("sarvagra");
        int[][] arr = new int[26][2];
        int index=0;
        for(int i=0;i<sb.length();i++){
            index=(int)sb.charAt(i)-97;
            arr[index][0]=(int)sb.charAt(i);
            arr[index][1]+=1;

        }Arrays.sort(arr, (a, b) -> Integer.compare(b[1], a[1]));
        System.out.println("Character :"+ (char)arr[0][0]);
        System.out.println("Occurance :"+ arr[0][1]);
    }
}

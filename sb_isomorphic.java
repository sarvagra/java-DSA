// check if the teo strings are isomorphic

public class sb_isomorphic {
    public static void main(String[] args) {
        String s="poof";
        String t="peer";
        char[] arr = new char[26];
        int p;
        boolean flag=true;

        if (s.length() != t.length()) {
            System.out.println("Not isomorphic");
            return;  // No need to check further
        }

        for(int i=0;i<s.length();i++){
            p=(int)s.charAt(i)-97;
            if(arr[p]=='\u0000'){
                arr[p]=t.charAt(i);
            }
            else if(arr[p]!=t.charAt(i)){
                flag=false;
                System.out.println("Not isomorphic");
                break;
            }
        }if(flag) System.out.println("Isomorphic");

    }   
}

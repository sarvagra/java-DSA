public class sb_toggle {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("SaRvAgRa");
        int a,s;
        char st;
        for(int i=0;i<sb.length();i++){
            a=(int)sb.charAt(i);
            if(a>=65 && a<=90){       // lower case to upper
                s=(int)sb.charAt(i)+32;
                st=(char)s;
                sb.setCharAt(i,st);
            }
            
            else if(a<=122 && a>=9){   // upper case to lower 
                s=(int)sb.charAt(i)-32;
                st=(char)s;
                sb.setCharAt(i,st);
            }
        }
        System.out.println(sb);

    }
}

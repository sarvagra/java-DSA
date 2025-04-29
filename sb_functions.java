

public class sb_functions {
    public static void main(String[] args) {
        /* StringBuilder sb=new StringBuilder("Sarvagra"); 
        StringBuilder tb=new StringBuilder("Singh"); 
        
        
        System.out.println(sb.compareTo(tb));

        // reverse()
        System.out.println(sb.reverse()); */

        StringBuilder sent = new StringBuilder("m'I eht tseb");
        StringBuilder rev = new StringBuilder();
        String wrd; int j=0;
        for(int i=0; i<sent.length();i++){
                if(sent.charAt(i)==' '){
                    wrd=sent.substring(j,i);
                    rev.append(wrd);
                    rev.reverse();
                    System.out.print(rev+" ");
                    rev.setLength(0);
                    wrd="";
                    j=i+1;
                    
                }
        }
        if(j<sent.length()){
            wrd=sent.substring(j,sent.length());
            rev.append(wrd);
            rev.reverse();
            System.out.print(rev);
        }
        /* 
        // important function that makes SB different and special from strings : setCharAt()
        tb.setCharAt(0, 'Q');
        System.out.println(tb);

        // append()
        System.out.println(tb.append("**"));
        int[] qt={1,2,3,4};
        System.out.println(tb.append(qt)); // note that we cannot append an integer array 

        System.out.println(sb.append(tb)); 


        // deleteCharAt()
        StringBuilder a = new StringBuilder("ABCDEFU");
        System.out.println(a);
        a.deleteCharAt(4); // delete a character at index 4
        System.out.println(a);
        a.delete(0, 2); //delete characters in range of index from 0-2 , note that it deletes elements till last index , not the  element on last index!!
        System.out.println(a);  

        // insert()
        
        System.out.println(a.insert(0,"AB")); //int can also be inserted etc.
        */
    }
}

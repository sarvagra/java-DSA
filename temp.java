class temp{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tomorrow is ");
        String st=sb.substring(0, 5);
        System.out.println(st);
        StringBuilder rev = new StringBuilder();
        rev.append(st);
        rev.reverse();
        System.out.println(rev);
        
    }
}
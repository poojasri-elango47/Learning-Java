import java.util.Scanner;
class replace{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the String");
        String sentence =sc.nextLine();
        StringBuilder sb=new StringBuilder(sentence);
       for(int i=0;i<sb.length();i++){
        if(i==0&&sb.charAt(i)!=' '){ 
           sb.setCharAt(i,Character.toUpperCase(sb.charAt(i)));
            continue;
            }
        if( sb.charAt(i)==' '&& i!=sb.length()){
              sb.setCharAt(i+1,Character.toUpperCase(sb.charAt(i+1)));
              }
       }
System.out.println("Capitalised version:\n"+sb);
    }
}
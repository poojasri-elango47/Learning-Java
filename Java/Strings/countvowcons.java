import java.util.Scanner;
class countvowcons{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=new String();
        System.out.println("Enter the string");
        str=sc.nextLine();
        int v=0,c=0;
        str=str.toLowerCase();
        str=str.replaceAll("[^a-zA-Z0-9]", "");
        for(int i=0;i<str.length();i++){
           char a=str.charAt(i);
           if("aeiou".indexOf(a)!=-1){
            v++;
           }
           else c++;
        }
        System.out.println("Vowels:"+v+"\nConsonants:"+c);
    }
}
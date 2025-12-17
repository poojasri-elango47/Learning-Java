import java.util.*;
class vowelcons{
    public static void main(String[] args) {
        char a;
        Scanner ch=new Scanner (System.in);
        a=ch.next().charAt(0);
        if((a>='A' && a<='Z')|(a>='a' && a<='z')){
        if("aeiouAEIOU".indexOf(a)!=-1){
            System.out.println("vowel");
        }
        else System.out.println("consonant");
    }
    else System.out.println("Not a letter");}
}
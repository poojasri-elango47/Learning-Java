import java.util.*;
class lastdig{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         String nstr=String.valueOf(n);
         int l=nstr.length();
         System.out.print(l+"\n");
         //using mathematical way
        l=0;
         l=((int)Math.log10(n)+1);
         
         System.out.print(l+"\n");
    }
}
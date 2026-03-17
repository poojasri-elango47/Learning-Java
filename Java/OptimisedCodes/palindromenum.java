import java.util.Scanner;
class palindromenum{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a num:");
        int num=sc.nextInt();
        int cpy=num;
        int rev=0;
        while(num>0){
            int dig=num%10;
            rev=rev*10+dig;
            num=num/10;
        }
       if(rev==cpy)System.out.print("Yes");
       else System.out.println("No");
        }}
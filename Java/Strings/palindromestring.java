import java.util.Scanner;
class palindromestring{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str1=new String();
        str1=sc.nextLine();
        String rev=new String();
        for(int i=str1.length()-1;i>=0;i--){
            rev+=str1.charAt(i);
        }
        if(rev.equals(str1)){
            System.out.println("Yes it is a palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }
        }}
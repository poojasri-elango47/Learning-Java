import java.util.*;
class wordcount{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a sentence");
        String sent=sc.nextLine();
int c=0;
        for(int i=0;i<sent.length();i++){
            if(sent.charAt(i)==' '){
c++;
            }
        }
        System.out.println("No.of words ="+(c+1));}}
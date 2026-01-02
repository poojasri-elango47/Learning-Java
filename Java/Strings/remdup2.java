import java.util.Scanner;
class remdup2{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the String");
        String sentence =sc.nextLine();
        String [] words =sentence.trim().split("\\s+");
        System.out.println("Word count="+words.length);

    }
}
import java.util.Scanner;
class Ascii_value{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Character:");
        char c=sc.next().charAt(0);
        int val=(int)c;

        System.out.println("ASCII Value="+val);
    }}


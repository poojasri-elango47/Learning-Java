import java.util.Scanner;
class stringequals{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=new String();
        String str2=new String();
        System.out.println("Enter the string1 and string2");
        str1=sc.nextLine();
        str2=sc.nextLine();
        if(str1.equals(str2)){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
    }}
import java.util.*;
class removedup{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        StringBuilder str=new StringBuilder(sc.nextLine());
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            for(int j=i+1;j<str.length();j++){
                if(ch==str.charAt(j)){
                    str.deleteCharAt(j);
                    j--;
                }
            }
        }

                System.out.println("Without duplicates  "+str);

    }
}
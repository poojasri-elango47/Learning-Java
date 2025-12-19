import java.util.*;
class SUmofndigits{
    public static void main(String[] args) {
        System.out.println("Enter num:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int  sum=((n*(n+1))/2);
        System.out.println("Sum="+sum);

    }
}
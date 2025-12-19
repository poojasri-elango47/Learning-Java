import java.util.Scanner;
class sumofdig{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a num:");
        int num=sc.nextInt();
        int sum=0,dig=0;
        while(num>0){
            dig=num%10;
            sum=sum+dig;
            num=num/10;
        }
        System.out.println("Sum="+sum);
        }}
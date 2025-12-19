import java.util.Scanner;
class armstrong{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a num:");
        int n1=sc.nextInt();
        int num=n1;
        int arm=0,dig=0;
        while(num>0){
            dig=num%10;
            arm+=(dig*dig*dig);
            num=num/10;
        }if(n1==arm){
            System.out.println("Yes, An Armstrong number");
        }
        else System.out.println("Not an Armstrong number");
        }}
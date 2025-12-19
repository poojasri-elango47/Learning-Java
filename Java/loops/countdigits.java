import java.util.Scanner;
class countdig{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a num:");
        int num=sc.nextInt();
        int count=0;
        while(num>0){
            count+=1;
            num=num/10;
        }
        System.out.println("count="+count);
        }}
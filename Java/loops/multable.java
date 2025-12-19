import java.util.Scanner;
class multable{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a num for multiplication table:");
        int num=sc.nextInt();
         System.out.println("Enter the number of rows:");
         int r=sc.nextInt();
        for(int i=1;i<=r;i++){
            System.out.println(num+" x "+i+" ="+num*i);
        }
        }}
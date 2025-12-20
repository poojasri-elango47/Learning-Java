import java.util.Scanner;
class rhombus{
    public static void main(String[] args) {
        System.out.println("Enter a num:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
           for(int k=0;k<i;k++){
            System.out.print(" ");
           }
            for(int j=1;j<=n;j++){
               System.out.print("*");
            }
            System.out.println("");
        }
    }
}
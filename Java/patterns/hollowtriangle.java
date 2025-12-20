import java.util.Scanner;
class hollowtriangle{
    public static void main(String[] args) {
        System.out.println("Enter a number of rows:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        
        for(int i=1;i<=n;i++){
           for(int k=1;k<=n-i;k++){
            System.out.print(" ");
           }
            for(int j=1;j<=i;j++){
                if(j==1||(i==j)||(i==n))
               System.out.print("* ");
               else {System.out.print("  ");}
            }
            System.out.println("");
        }
        
    }
}
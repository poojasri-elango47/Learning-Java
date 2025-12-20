import java.util.Scanner;
class diamond{
    public static void main(String[] args) {
        System.out.println("Enter a number of rows:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=n/2+1;
        
        for(int i=1;i<=n1;i++){
           for(int k=1;k<=n1-i;k++){
            System.out.print(" ");
           }
            for(int j=1;j<=i;j++){
               System.out.print("* ");
            }
            System.out.println("");
        } for(int i=n1-1;i>=1;i--){
           for(int k=1;k<=n1-i;k++){
            System.out.print(" ");
           }
            for(int j=i;j>=1;j--){
               System.out.print("* ");
            }
            System.out.println("");
        }
        
    }
}
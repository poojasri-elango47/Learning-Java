import java.util.Scanner;
class hourglass{
    public static void main(String[] args) {
        System.out.println("Enter a number of rows:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=0;
        for(int i=n;i>=1;i--){
           for( k=1;k<=n-i;k++){
            System.out.print(" ");
           }
            for(int j=i;j>=1;j--){
                if((j==i)||(j==1)||(i==n))
               System.out.print("* ");
               else {System.out.print("  ");}
            }
            System.out.println("");
        }
        
        for(int i=1;i<=n;i++){
           for( k=1;k<=n-i;k++){
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
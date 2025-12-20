import java.util.Scanner;
class invertedhollowtri{
    public static void main(String[] args) {
        System.out.println("Enter a number of rows:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=0;
        
        for(int i=n;i>=1;i--){
           for( k=0;k<n-i;k++){
            System.out.print(" ");
           }
            for(int j=i;j>=1;j--){
                if((j==i)||(j==1)||(i==n))
               System.out.print("* ");
               else {System.out.print("  ");}
            }
            System.out.println("");
        }
        
    }
}
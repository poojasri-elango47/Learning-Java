import java.util.Scanner;
class kpattern{
    public static void main(String[] args) {
        System.out.println("Enter a num:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mid=0;
        if(n%2==0) mid=n/2;
        else mid=n/2+1;
           for(int i=mid;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        
        for(int i=1;i<=mid;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
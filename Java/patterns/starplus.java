import java.util.Scanner;
class starplus{
    public static void main(String[] args) {
        System.out.println("Enter a num:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int mid=0;
        if(n%2==0)
         mid=n/2;
        else  mid=n/2+1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==mid||j==mid)
                System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
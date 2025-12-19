import java.util.*;
class primenum{
    public static void main(String[] args) {
        System.out.println("Enter num:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
               System.out.println("Not a prime");

               return ;}
        }
        System.out.println("Yes, a prime");
        return ;
    }
}
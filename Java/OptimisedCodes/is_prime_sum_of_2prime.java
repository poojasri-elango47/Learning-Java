import java.util.*;
class is_prime_sum_of_2prime{
    static boolean isprime(int n){
        if(n==1||n==0) return false;
          if(n==2||n==3) return true;
          if((n%2==0)||(n%3==0)) return false;
          for(int i=5;i*i<=n;i=i+6){
            if((n%i==0)||(n%(i+2)==0)) 
            return false;
          }return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isprime(n)&&isprime(n-2)){
            System.out.println("YES");
        }
        else System.out.println("No");
    }
}
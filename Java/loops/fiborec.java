import java.util.Scanner;
class fiborec{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a num:");
    int num=sc.nextInt();
   System.out.println("Fibonacci num"+fibo(num));
    
    }
    static int fibo(int n){
       if(n<=1) return n;

return fibo(n-1)+fibo(n-2);
    }
    
    }

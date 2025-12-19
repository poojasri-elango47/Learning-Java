import java.util.Scanner;
class fact{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a num:");
    int num=sc.nextInt();
   System.out.println("Factorial is "+fact1(num));
    
    }
    static int fact1(int n){
       if(n<=1) return 1;

return n*fact1(n-1);
    }
    
    }

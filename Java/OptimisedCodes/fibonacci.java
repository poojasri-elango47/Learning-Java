import java.util.*;

class fibonacci{
    static int fibo(int n){
       int c=0;
            int a=-1;int b=1;
            for(int i=1;i<=n;i++){
                 c=a+b;
                System.out.print(c+" ");
                a=b;
                b=c;
            }
return c;
                    
    }
    public static void main (String[] args) {
		// your code goes here
		Scanner sc=new Scanner (System.in);
       int n=sc.nextInt();
      int res=fibo(n);
      System.out.println("\n"+ n+" th term is "+res);
		}


}

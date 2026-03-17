import java.util.*;

class alldivisors{
  
    public static void main (String[] args) {
		// your code goes here
		Scanner sc=new Scanner (System.in);
       int n=sc.nextInt();
       
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                if(i*i==n)System.out.print(i+" ");
                else System.out.print(i+" "+(n/i)+" ");
            }
        }
		}


}

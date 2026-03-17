import java.util.*;

class strongnum{
    static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f*=i;
        }
        return f;
    }
    public static void main (String[] args) {
		// your code goes here
		Scanner sc=new Scanner (System.in);
       int n=sc.nextInt();
       int sum=0;int cpy=n;
       while(n>0){
        int d=n%10;
        sum+=fact(d);
        n=n/10;
    
               }
		if(sum==cpy){
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
		}


}


import java.util.*;

class armstrong
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	        int sum=0;int cpy=n;
	       int ndig= calcdig(n);
	       while(cpy>0){
	           int d=cpy%10;
	           sum+=(int)Math.pow(d,ndig);
	           cpy=cpy/10;
	       }
	       if(n==sum)
	       System.out.print(" Yes");
           else
           System.out.print("No");
	    }
	    
	
	static int calcdig(int n){
	    int c=0;
	    while(n>0){
	      c++;
	      n=n/10;
	        
	    }
	    return c;
	}
}

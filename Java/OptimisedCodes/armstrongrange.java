
import java.util.*;

class armstrongrange
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int l=sc.nextInt();
	    int r=sc.nextInt();
	    for(int i=l;i<=r;i++){
	        int sum=0;int cpy=i;
	       int ndig= calcdig(i);int d=0;
	       while(cpy>0){
	           d=cpy%10;
	           sum+=Math.pow(d,ndig);
	           cpy=cpy/10;
	       }
	       if(i==sum)
	       System.out.print(i+" ");
	    }
	    
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

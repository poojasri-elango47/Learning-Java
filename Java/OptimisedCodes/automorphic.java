
import java.util.*;

class automorphic
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int sq=n*n;
	    
	    String nstr=String.valueOf(n);
	    int ln=nstr.length();
	  
	    String sqstr=String.valueOf(sq);
	    int l=sqstr.length();
	    
	    
	    String lasttwo=sqstr.substring(l-ln,l);
	    
	   if(nstr.equals(lasttwo)){
	       System.out.println("Yes");
	   }
	    else{
	        System.out.println("NO");
	    }

	}
}

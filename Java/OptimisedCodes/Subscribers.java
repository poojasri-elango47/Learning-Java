import java.util.*;

class Subscribers
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);

	    int n=sc.nextInt();
	    int x=sc.nextInt();
	    if(n%6!=0){
	        n=n+5;
	    }
	    System.out.println((n/6)*x);


	}
}

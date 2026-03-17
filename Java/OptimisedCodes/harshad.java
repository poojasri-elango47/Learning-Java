import java.util.*;


class harshad
{
	public static void main (String[] args) throws java.lang.Exception
	{int sum=0;
		// your code goes here
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int cpy=n;
		while(n>0){
		    int dig=n%10;
		    sum+=dig;
		    n=n/10;
		    
		}
		if(cpy%sum==0){
		    System.out.println("yes");
		}
		else
		System.out.println("No");

	}
}

import java.util.*;


class HoursConstraint
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner (System.in);
		
		    int h=sc.nextInt();
		    if(h>10){
		        h=24-h;
		    }
		    if(Math.abs((10-h))>=3){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("No");
		    }
	

	}
}

import java.util.*;

class primerange
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int l=sc.nextInt();
	    int r=sc.nextInt();
	    for(int i=l;i<=r;i++){
	        int f=0;
	        if(i==1)f=1;
	        for(int j=2;j*j<=i;j++){
	            
	            if(i%j==0){
	                f=1;
	                break;
	            }
	        }
	        if(f==0)
	        System.out.print(i+" ");
	    }
	}
}

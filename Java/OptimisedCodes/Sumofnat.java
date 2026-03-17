import java.util.*;


class Sumofnat
{  static int fun(int n){

        if(n==1){
            return 1;
        }
       return n+fun(n-1);
    }
	
	
    public static void main (String[] args) {
		// your code goes here
		Scanner sc=new Scanner (System.in);
	       int a=sc.nextInt();
		   int sum= fun(a);
           System.out.println(sum);
		
		}


   
}

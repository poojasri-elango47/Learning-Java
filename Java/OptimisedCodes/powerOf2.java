import java.util.*;

class powerOf2{
    
    public static void main (String[] args) {
		// your code goes here
		Scanner sc=new Scanner (System.in);
       int n=sc.nextInt();
       int f=1;
       //repetitive division
       while(n>1){
        if(n%2!=0) {f=0;break;}
        n=n/2;
       }
       if(f==1)System.out.print("Yes");
       else System.out.print("No");
		}


}

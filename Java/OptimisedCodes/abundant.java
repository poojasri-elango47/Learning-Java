import java.util.*;

class abundant{
    public static void main (String[] args) {
		// your code goes here
		Scanner sc=new Scanner (System.in);
       int n=sc.nextInt();
       int sum=1;
       for(int i=2;i*i<n;i++){
        if(n%i==0){
            if(i*i==n){
                sum+=i;
            }
            else{
                sum+=(i+(n/i));
            }
        }
       }
		if(sum>n){
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
		}


}

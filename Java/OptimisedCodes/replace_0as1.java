import java.util.*;
class replace_0as1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=1,ans=0;
        while(n>0){
            int d=n%10;
            if (d==0) d=1;
            ans+=(temp*d);temp*=10;n=n/10;
        }
        System.out.println(ans);
       
    }
}
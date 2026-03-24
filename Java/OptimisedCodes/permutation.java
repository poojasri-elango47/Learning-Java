import java.util.*;
class permutation{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        long f=1;
        for(int i=n;i>(n-r);i--){
            f*=i;
        }System.out.println(f);
    }
}
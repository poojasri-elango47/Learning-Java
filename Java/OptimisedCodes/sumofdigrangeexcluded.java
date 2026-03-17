import java.util.*;
class sumofdigrangeexcluded{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int r=sc.nextInt();
        int ans=sumn(r-1)-sumn(l);
        System.out.print(ans);
    }
    static int sumn(int n){
       return (n*(n+1))/2;
    }
}
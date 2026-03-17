import java.util.*;
class sumofdig{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        n=Math.abs(n);
        int ans=sumof(n);
        System.out.println(ans);
    }
    static int sumof(int n){
        if(n<10)return n;
        return (n%10)+sumof(n/10);
    }
}
import java.util.*;
class sumofdigrangerec{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int r=sc.nextInt();
        int ans=find(l,r);
        System.out.print(ans);
    }
    static int find(int l,int r){
       if(l>r) return 0;
       return l+find(l+1,r);
    }
}
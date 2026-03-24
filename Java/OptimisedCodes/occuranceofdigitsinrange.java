import java.util.*;
class occuranceofdigitsinrange{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int tosearch=sc.nextInt();
        int c=0;
        for(int i=a;i<=b;i++){
            int num=i;
            while(num>0){
                int dig=num%10;
                if(dig==tosearch) c++;
                num=num/10;
            }

        }System.out.println(c);
    }
}
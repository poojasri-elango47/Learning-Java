import java.util.Scanner;
class fiboloop{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a num:");
    int num=sc.nextInt();
    int a=0;
    int b=1;
    System.out.print(a+" "+b+" ");
    int cur=0;
    for(int i=2;i<num;i++){
cur=a+b;
a=b;
b=cur;
System.out.print(cur+" ");
    }
    
    
    }
}
import java.util.*;
class gcdlcm{
    public static void main(String[] args){
Scanner sc=new Scanner (System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int cpya=a,cpyb=b;
while((a>0) &&(b>0)){
    if(a>b){
        a=a%b;
    }
    else b=b%a;
}
int gcd=(a==0)?b:a;
int lcm=(cpya*cpyb)/gcd;
System.out.print("GCD : "+gcd+" LCM: "+lcm);
    }
}
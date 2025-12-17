import java.util.Scanner;
class Largestof2{
    public static void main(String [] data){
        Scanner n=new Scanner (System.in);
        int a=n.nextInt();
        int b=n.nextInt();
        if(a>b){
            System.out.println(a+" is larger");

        }
    else if (a<b){
        System.out.println(b+" is larger");

    }
    else System.out.println("Equal");
    }
}
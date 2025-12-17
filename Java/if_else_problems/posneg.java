import java.util.Scanner;
class posneg{
    public static void main(String [] data){
        Scanner n=new Scanner (System.in);
        int a=n.nextInt();
        if(a==0) System.out.println("Zero");
        if(a>0){
            System.out.println(a+" is positive");

        }
    else if (a<0){
        System.out.println(a+" is negative");

    }
    
    }
}
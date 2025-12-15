import java.util.Scanner;
class SimpleInterest{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Principle,Number of years,Rate of interest");
        float P=sc.nextFloat();
        float n=sc.nextFloat();
        float r=sc.nextFloat();
        float I=(P*n*r)/100;
        System.out.println("Simple Interest="+I);
    }
}
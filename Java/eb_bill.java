import java.util.Scanner;
class eb_bill{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter units:");
        float units=sc.nextFloat();
        float bill=0;
        if(units<=100){
             bill=0;
        }
        else if(units <=200){
            bill=(units-100)*2;
        }
        else if(units<=500){
            bill=(100*2)+(units-200)*3;
        }
        else {
            bill=(100*2)+(300*3)+(units-500)*5;
        }
        System.out.println("EB bill is "+bill);
    }
}
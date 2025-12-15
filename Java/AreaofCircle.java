import java.util.Scanner;

class AreaofCircle{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Radius:");
        float r=sc.nextFloat();
        float Area=(float)Math.PI*r*r;
        System.out.println("Area of Circle:"+Area);

    }
}
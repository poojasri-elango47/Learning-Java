import java.util.*;
class employee{
    public static void main(String[] args) {
        Empsal e1=new Empsal();
        e1.yearlysal();
    }
}
class Empsal{
    void yearlysal(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter empid,name and monthly sal");
        int id=sc.nextInt();
        sc.nextLine();
        String name=sc.nextLine();
        float sal=sc.nextFloat();
        float yearly=sal*12;
        System.out.println("Per Annum income is "+yearly);
    }
}
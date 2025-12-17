import java.util.*;
class dayname {
    public static void main(String[] args) {
        System.out.println("Enter day number(0->Sun)to(6->Sat):");
        Scanner n=new Scanner(System.in);
        int num=n.nextInt();
        String [] array={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        System.out.println("Day is :"+array[num]);
    }
}
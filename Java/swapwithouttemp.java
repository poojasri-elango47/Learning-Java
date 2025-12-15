import java.util.Scanner;
class swapwithouttemp{
    public static void main(String[] args) {
        
      Scanner sc=new Scanner(System.in);
      System.out.println("enter 2num to swap usimg add,sub method");
      int a1=sc.nextInt();
      int b1=sc.nextInt();
      // using add,sub method
      a1=a1+b1;
      b1=a1-b1;
      a1=a1-b1;
      System.out.println("Swappednumbers(Add,sub method) a1="+a1+" b1="+b1);

      System.out.println("enter 2num to swap usimg mul,div method");
      int a2=sc.nextInt();
      int b2=sc.nextInt();
      // using add,sub method
      a2=a2*b2;
      b2=a2/b2;
      a2=a2/b2;
      System.out.println("Swappednumbers(Mul,Div method) a2="+a2+" b2="+b2);

      System.out.println("enter 2num to swap usimg xor method");
      int a3=sc.nextInt();
      int b3=sc.nextInt();
      // using add,sub method
      a3=a3^b3;
      b3=a3^b3;
      a3=a3^b3;
      System.out.println("Swappednumbers(Xor method) a3="+a3+" b3="+b3);



    }
}
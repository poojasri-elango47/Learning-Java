import java.util.Scanner;
class Evenodd{
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        int num=n.nextInt();
        if(num%2==0){
            System.out.println("Even");

        }else System.out.println("Odd");
    }
}
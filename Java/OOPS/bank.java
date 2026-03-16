import java.util.*;


class bank{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       Bankbalance b=new Bankbalance();
      System.out.println("Enter account number");
      long accno=sc.nextLong();
      System.out.println("choose 1 to deposit ,2 to withdraw , 3 to know the balance");
      int n=sc.nextInt();
      switch (n){
        case 1:
            System.out.println("Enter amt to deposit");
            float amtd=sc.nextFloat();
            b.deposit(amtd);
            break;
      
       case 2:
        System.out.println("Enter amt to withdraw");
           float amtw=sc.nextFloat();
           b.withdraw(amtw);
           break;
        case 3:
            b.getbalance();
            break;
        default:
            System.out.println("Invalid code");
            break;

      }

  }
    }
    

class Bankbalance{
    private float min=500;
    private float balance=1000;

 void getbalance(){
        System.out.println("Your Current Balance is "+balance);
 }
 void withdraw(float amt){
    if(amt>=balance||(balance-amt)<min){
           float ucanwithdraw=balance-min;
    System.out.println("You can withraw upto "+ucanwithdraw);
        System.out.println("Insufficient balance");
        return;
    }

    balance=balance-amt;
    getbalance();
    

 }
 void deposit(float amt){
    balance=balance+amt;
    getbalance();
 }
}
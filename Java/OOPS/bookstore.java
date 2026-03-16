import java.util.*;
class bookstore{
    public static void main(String[] args) {
        bookprice b1=new bookprice();
        float discprice=b1.applydisc();
        System.out.println("Discounted price is "+discprice);
    }
}
class bookprice{
    float applydisc(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter title,author and price");
      
        String title=sc.nextLine();
        String author=sc.nextLine();
        
        float price=sc.nextFloat();
         if(price>=1000) return price*(float)0.70;
         else if(price>=500) return price*(float)0.80;
         else return price*(float)0.90;
    }
}
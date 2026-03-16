import java.util.*;


class student{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      
    
      System.out.println("Enter number of students");
      
      int n=sc.nextInt();
      for(int i=1;i<=n;i++){
      System.out.println("Enter Student "+i+" details");
      System.out.println("Enter roll number, name and marks scored out of 100");
      StudRec s1=new StudRec();
      int roll=sc.nextInt();
      sc.nextLine();
      String name=sc.nextLine();
      float marks=sc.nextFloat();
      s1.display(roll, name, marks);  }
    }
    
}
class StudRec{
    void display(int roll,String name,float marks){
        System.out.println("STUDENT DETAILS");
        System.out.println("ROLL NO | NAME | MARKS ");
        System.out.println(roll+" "+name+" "+marks);
        isPass(marks);

    }
  void isPass(float marks){
  if(marks>=40){
    System.out.println("Passed\n");
  }
  else System.out.println("Failed\n");
  }
}
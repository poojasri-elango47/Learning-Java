import java.util.*;
class calculator {
    static int add(int x,int y){
        return x+y;
    }
     static int sub(int x,int y){
        return x-y;
    }
     static int mul(int x,int y){
        return x*y;
    }
     static int div(int x,int y){
        return x/y;
    }
     static int mod(int x,int y){
        return x%y;
    }
public static void main(String[] args) {
    int a=0;
    int b=0;
    int res=0;
    char rep;
    System.out.println("CALCULATOR");
    System.out.println("1->ADD\n2->SUB\n3->MUL\n4->DIV\n5->MOD\n");
    do{System.out.println("Enter mode to calculate");
    Scanner m=new Scanner(System.in);
    
    int mode =m.nextInt();
    if(mode>=1 && mode<=5){
        System.out.println("Enter two values to perform arithmetic operation:");
      a=m.nextInt();
      b=m.nextInt();
    }
    else{
        System.out.println("Enter valid mode");
    }
 switch(mode){
   case 1:
        res=add(a,b);
        System.out.println("Answer is"+res);
        break;
    case 2:
        res=sub(a,b);
        System.out.println("Answer is"+res);
        break;
    case 3:
        res=mul(a,b);
        System.out.println("Answer is"+res);
         break;
    case 4:
        res=div(a,b);
        System.out.println("Answer is"+res);
        break;
    case 5:
        res=mod(a,b);
        System.out.println("Answer is"+res);
        break;
    

 }
 
 System.out.println("Do you want to continue(y/n):");
 rep = m.next().charAt(0);}while(rep=='y'|rep=='Y');
    
}
}
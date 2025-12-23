import java.util.*;
class linsearch{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int []arr={2,7,4,6,9,1,0};
       System.out.println("Enter the key:");
       int key=sc.nextInt();
       int pos=-1;
       for(int i=0;i<7;i++){
        if(key==arr[i]){
        pos=i;
        break;}
            
       }
       if(pos!=-1)
System.out.println("Key found at "+(pos+1)+" Position");
else System.out.println("Key not found");

        
    }
    }
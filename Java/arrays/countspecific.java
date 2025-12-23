
import java.util.*;
class countspecific{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          System.out.println("Enter the Number of elements:");
   int n=sc.nextInt();
   int [] arr= new int[n];
  
       System.out.println("Enter the Elements:");
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        
       }
       System.out.println("Enter the element to count");
       int key=sc.nextInt();
       int c=0;
         for(int i=0;i<n;i++){
           
                if(key==arr[i]){
                    c++;
                    
                }

         }
 System.out.println("Count->"+c);  
    }
    }

import java.util.*;
class countelements{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          System.out.println("Enter the Number of elements:");
   int n=sc.nextInt();
   int [] arr= new int[n];
   boolean [] visited=new boolean[n];
       System.out.println("Enter the Elements:");
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        visited[i]=false;
       }
         for(int i=0;i<n;i++){
            if(visited[i]){
                continue;
            }
            int c=1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    c++;
                    visited[j]=true;
                }

            }
            System.out.println(arr[i]+"->"+c);
         }
       

        
    }
    }
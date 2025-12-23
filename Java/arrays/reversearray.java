import java.util.*;
class reversearray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter number of elements:");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter n elements:");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
                    }
        int [] rev=new int[n];
        for(int i=0,j=n-1;i<n;i++,j--){
           rev[j]=arr[i];
        }
        for(int i=0;i<n;i++){
            System.out.print("rev["+i+"]="+rev[i]+" ");
        }
        
    }
    }
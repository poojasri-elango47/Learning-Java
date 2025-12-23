import java.util.*;
class sumavgarray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter number of elements:");
        int n=sc.nextInt();
        float [] arr=new float[n];
        System.out.println("Enter n elements(float also):");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextFloat();
                    }
     float sum=0;float avg=0;
     for(int i=0;i<n;i++){
        sum+=arr[i];

                    }
        avg=sum/n;
       
        System.out.println("Sum: "+sum+"\n"+"Avg: "+avg);
        
    }
    }
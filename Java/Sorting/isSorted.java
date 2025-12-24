import java.util.*;
class isSorted{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array elements:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean issorted=true;
        for(int i=0;i<n-1;i++){
            if(arr[i+1]<arr[i]){
                issorted=false;
                break;
            }
        }
        if(issorted){
            System.out.println("Sorted array");
        }
        else{
            System.out.println("Not Sorted");
        }
    }
}
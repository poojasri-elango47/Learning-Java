import java.util.Scanner;
class missingnum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=sc.nextInt();
        int [] arr=new int[n-1];
        int arrsum=0;
        System.out.println("Enter the"+(n-1)+" elements ");
        for(int i=0;i<n-1;i++){
            arr[i]=sc.nextInt();
            arrsum+=arr[i];
        }
        int totalsum=(n*(n+1))/2;
        int missing=totalsum-arrsum;
        System.out.println("Missing element->"+missing);
           }
}
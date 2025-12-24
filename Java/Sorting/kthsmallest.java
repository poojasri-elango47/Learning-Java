import java.util.Scanner;
class kthsmallest{
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of elements");
        int n=sc.nextInt();
        int [] arr=new int[n];
         System.out.println("Enter elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=1 ;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 &&arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        System.out.println("Enter the order of smallest ");
        int k=sc.nextInt();
        int s=0;
        int num=1;
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[i-1]){
                num++;
               

            }
          
            if(num==k){
                s=i;
                break;
            }
        }
        System.out.println(k +"th smallest is "+arr[s]);
    }
}
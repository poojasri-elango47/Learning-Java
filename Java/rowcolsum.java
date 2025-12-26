import java.util.Scanner;
class rowcolsum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the matrix length(m&n)");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int [] [] arr =new int[m][n];
         int []rowsum=new int[m];
         int []colsum=new int[n];
        
        
        System.out.println("Enter array elements");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){

                arr[i][j]=sc.nextInt();
                
            }
        }
        
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            rowsum[i]+=arr[i][j];
        }
    }
        for(int j=0;j<n;j++){
        for(int i=0;i<m;i++){
            colsum[j]+=arr[i][j];
        }
    } 
    System.out.println("Rowsum"); 
    for(int i=0;i<m;i++){
        System.out.println(i+"->"+rowsum[i]);
    }
     System.out.println("columnsum"); 
    for(int i=0;i<n;i++){
        System.out.println(i+"->"+colsum[i]);
    }
    }
}
import java.util.Scanner;
class Array2D{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the matrix length(m&n)");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int [] [] arr =new int[m][n];
        int[] [] trans=new int[n][m]  ;
        
        
        System.out.println("Enter array elements");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){

                arr[i][j]=sc.nextInt();
                
            }
        }
         for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                trans[j][i]=arr[i][j];
                
            }
            
        }
       for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){

           System.out.print(trans[i][j]+" ");
                
            }
            
            System.out.println("");
        }
        
    }
}
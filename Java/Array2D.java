import java.util.Scanner;
class Array2D{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the matrix length");
        int m=sc.nextInt();
        int [] [] arr =new int[m][m];
        int sum=0,sumd=0;
        System.out.println("Enter array elements");
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){

                arr[i][j]=sc.nextInt();
                sum+=arr[i][j];
                if(i==j)
                sumd+=arr[i][j];
                

            }
        }
        System.out.println("Total Sum of Elements="+sum);
        System.out.println("Diagonal Sum of Elements="+sumd);

    }
}
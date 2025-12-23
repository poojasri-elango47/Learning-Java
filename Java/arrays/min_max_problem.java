import java.util.*;
class min_max_problem{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[5];
        System.out.println("Enter 5 elements:");
        for (int i = 0; i < 5; i++) {
            arr[i]=sc.nextInt();

            
        }
        int min=arr[0];int max=arr[0];
        for(int i=0;i<arr.length;i++){
              min=min>arr[i]?arr[i]:min;
              max=max<arr[i]?arr[i]:max;
        }
        System.out.println("Min: "+min+"\n"+"Max: "+max);
        
    }
    }
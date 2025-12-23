import java.util.*;
class binsearch{
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int []arr={10,20,30,40,50,60,70,80,90,100};

       System.out.println("Enter the key:");
       int key=sc.nextInt();
       int pos=-1;
       pos=binarykey(arr, key);
       if(pos!=-1){
        System.out.println("Key found at "+(pos+1)+" position");
       }
       else System.out.println("Key not found");
      
     
       
       }

      public static int binarykey(int[] arr,int key){
       int high=arr.length-1;
       int low=0;
       
       while(low<=high){
        int mid=(high+low)/2;
       if(arr[mid]==key)
       return mid;
       else if(arr[mid]>key)
         high=mid-1;
       else if(arr[mid]<key)
       low=mid+1;

       }
   
    
      return -1;
       
    }
    }
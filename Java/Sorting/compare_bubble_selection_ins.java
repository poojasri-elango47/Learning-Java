import java.util.Scanner;
class compare_bubble_selection_ins{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no.of elements ");
        int n=sc.nextInt();
        int[] arr1=new int[n];
        int[] arr2=new int[n];int[] arr3=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
           
        }  for(int i=0;i<n;i++){
            arr2[i]=arr1[i];
            arr3[i]=arr1[i];
           
        }

          int selectc=0,selectswap=0;
        for(int i=0;i<n-1;i++){
            
            int min=i;
            for(int j=i+1;j<n;j++){
                selectc++;
                if(arr2[min]>arr2[j]){
                    min=j;
                }
            }
            int temp=arr2[i];
            arr2[i]=arr2[min];
            arr2[min]=temp;
            selectswap++;
        }
       int insertc=0,insertshift=0;
   
     for(int i=1;i<n;i++){
    int key=arr3[i];
    int j=i-1;
    while(j>=0){
        insertc++;
        if(arr3[j]>key){
            arr3[j+1]=arr3[j];
            insertshift++;
            j--;
        } else break;
    }
    arr3[j+1]=key;
}

         int min=0,temp=0;
           int bubblec=0,bubbleswap=0;
        for(int i=0;i<n-1;i++){
    for(int j=0;j<n-1-i;j++){
        bubblec++;
        if(arr1[j] > arr1[j+1]){
             temp=arr1[j];
            arr1[j]=arr1[j+1];
            arr1[j+1]=temp;
            bubbleswap++;
        }
    }
}
System.out.println("Bubblesort comparisons:"+bubblec);
    System.out.println("Bubblesort swaps:"+bubbleswap);
        System.out.println("selectionsort comparisons:"+selectc);
        System.out.println("selectionsort swaps:"+selectswap);
        System.out.println("insertionsort comparisons:"+insertc);
        System.out.println("insertionsort shift:"+insertshift);
    }
    
}

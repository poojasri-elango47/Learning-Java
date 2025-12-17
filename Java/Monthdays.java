import java.util.*;
class Monthdays{
    public static void main(String[] args) {
        System.out.println("Enter Month number");
        Scanner m=new Scanner(System.in);
        int num=m.nextInt();
        List<Integer> list31=new ArrayList<>(Arrays.asList(1,3,5,7,8,10,12));
        List<Integer> list30=new ArrayList<>(Arrays.asList(4,6,9,11));
        if(num==2){
            System.out.println("No. of Days is 28 or 29(LeapYear)");
        }
        else{
            if(list31.contains(num)){
                System.out.println("No.of.Days is 31");
            }
          else  if(list30.contains(num)){
                System.out.println("No.of.Days is 30");
            }
            else System.out.println("Enter valid month");
        }

    }
}
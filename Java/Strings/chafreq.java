import java.util.*;
class chafreq{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        int [] freq=new int[26];
        str=str.toLowerCase();
    
        for(int i=0;i<str.length();i++){

            char ch=str.charAt(i);
            if(!(ch>=97 && ch<=122)){
                continue;
            }
            freq[ch-'a']++;

        }
        for(int i=0;i<26;i++){
            if(freq[i]==0){
                continue;
            }
            System.out.println((char)(i+'a')+" : "+freq[i]);
        }
    }
}

class defaultconst{
    public static void main(String[] args) {
        deconst d1=new deconst();
        d1.display();
    }
}
class deconst{
    String s;int a;
    deconst(){
System.out.println("Default constructor invoked");
    }
    void display(){
        System.out.println("Data displayed is "+s+" "+a);
    }
}
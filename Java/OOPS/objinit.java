class objinit{
    public static void main(String[] args) {
       demo d1=new demo();
       demo d2=new demo();
       d2.a=20;
       d2.b=40;
       d1.display();
       d2.display(); 
    }
}
class demo{
    int a,b;
    demo(){
a=5;b=10;
    }
    void display(){
        System.out.println("A="+a+" B="+b);
    }
}
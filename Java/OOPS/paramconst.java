
class paramconst{
    public static void main(String[] args) {
        pconst p1=new pconst("Pooja Elango",20);
        p1.display();
    }
}
class pconst{
    String s;int a;
    pconst(String s,int a){
        this.s=s;
        this.a=a;
    }
    void display(){
        System.out.println("Data passed is "+s+" "+a);
    }
}
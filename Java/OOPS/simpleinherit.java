class simpleinherit{
    public static void main(String[] args) {
        person p=new person();
        p.display("Pooja", 20);
        student s=new student();
        s.display(20);
    }
}
class person{
    String name="sandhiya";
    int age=18;
    void display(String name,int age){
        System.out.println("Name="+name+" Age="+age);
    }
    
}
class student extends person {
    void display( int roll){
        System.out.println("This is a student");
       System.out.println("Name="+name+" Age="+age+" Roll no"+roll); 
    }

}


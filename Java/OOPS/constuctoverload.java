class constructoverload{
    public static void main(String[] args){
      Student s1=new Student("pooja");
      s1.disp();
      Student s2=new Student("Pavi",90);
      s2.disp();
   
    }
}
class Student{
    String name;
    float marks;

     Student(String name) {
        this.name=name;
        marks=5;
    }
    Student(String name, float marks){
        this.name=name;
        this.marks=marks;
    }
    void disp(){
        System.out.println("Name="+name+"Marks="+marks);
    }
    
}
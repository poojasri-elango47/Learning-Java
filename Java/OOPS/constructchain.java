class constructchain{
    public static void main(String[] args) {
        System.out.println("M1 object");
        Mother m1=new Mother();
        System.out.println("M2 object");
        Mother m2=new Mother("Parvathy");
        System.out.println("C1 object");
        child c1=new child();

    }
}
class Mother{
    String name;
    Mother(){
        this("Swathi");
        System.out.println("Mother default called");
                


    }
    Mother(String n){
        name=n;
System.out.println("Mother parametered called");
    }

}
class child extends Mother{
    child(){
           
          super();
        System.out.println("Child called");
      
        
    }
}
class A{
    String name="jayesh";    // data member
    void Name(){             // member function
         
        System.out.print(name);
    }
}
class B extends A{
    String surname="shinde";

    void surName(){
        
        System.out.println(super.name+" "+surname);

      
    }
}
public class Supervariable {
    public static void main(String[] args) {
        B obj=new B();
        obj.surName();
    }
}

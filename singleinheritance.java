class name{
    
   void printname(){
        String name="jayesh";
        System.out.println(name);
    }

}

public class singleinheritance extends name {
    public static void main(String[] args) {
        singleinheritance name1=new singleinheritance();
        
        name1.printname();
    }
    
}

interface student{
   void name();
   void section();
   void age();
}

class imp implements student{
    public void name(){
        System.out.println("sushant");
    }
    public void section(){
        System.out.println("B");
    }
    public void age(){
        System.out.println("21");
    }
}



public class inter {
    public static void main(String[] args) {
        
         student obj=new imp();
         obj.age();
         obj.name();
         obj.section();   
        
    }
    
}

interface NewCar{
    void Button ();
    void Break ();
    void Gear();
}

class Carfun1 implements NewCar{
   public void Button(){
    System.out.println("start the care");
   }
   public void Break(){
    System.out.println("stop the car");
   }
   public void Gear(){
    System.out.println("change the gear");
   }

}
public class interfaceexample {
    public static void main(String[] args) {
        NewCar obj1=new Carfun1();
        obj1.Break();
        obj1.Button();
        obj1.Gear(); 
    }
    
}

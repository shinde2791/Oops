interface CarFunNew {
    void Button();

}

interface CarFunNew2 {
    void Break();
}

class Allcar implements CarFunNew, CarFunNew2 {
    public void Button() {
        System.out.println("start the car");
    }
  
    public void Break() {
        System.out.println("stop the car");
    }
}

public class multipleinheritance {
    public static void main(String[] args) {
        Allcar obj1 = new Allcar();
        obj1.Break();
        obj1.Button();
    }

}

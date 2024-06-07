abstract class vehicle{
    abstract void speed();
    abstract void average();
    abstract void type();
}

class gadi extends vehicle{
    void speed(){
        System.out.println("24kmph");
    }

    void average(){
        System.out.println("30average");
    }

    void type(){
        System.out.println("commercial");
    }
}

public class abstractionsecond {
    public static void main(String[] args) {
        vehicle v1=new gadi();
        v1.average();
        v1.speed();
        v1.type();
    }
    
    
    
}

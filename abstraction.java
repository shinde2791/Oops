abstract class Shape {
    abstract void Area();

    abstract void dymansional();

    void Defination() {
        System.out.println("the area of circle , traingle, square");
    }
}

class Traingle extends Shape {
    void Area() {
        System.out.println("length * height");
    }
 
    void dymansional() {
        System.out.println("lenght + breath");
    }
} 

class Circle extends Shape {
    void Area() {
        System.out.println("A=πr2");
    }

    void dymansional() {
        System.out.println("length and width");
    }
}

class Square extends Shape {
    void Area() {
        System.out.println("A=a2");
    }

    void dymansional() {
        System.out.println("Area = (Side)2");
    }
}

public class abstraction {
    public static void main(String[] args) {
        Shape obj1 = new Traingle();
        obj1.Defination();
        obj1.Area();
        obj1.dymansional();

        Shape obj2 = new Circle();
        obj2.Area();
        obj2.dymansional();

        Shape obj3 = new Circle();
        obj3.Area();
        obj3.dymansional();
    }

}

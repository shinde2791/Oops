class A {
    int x;
    int y;

    A(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class B extends A {
    int c;

    B(int x, int y, int c) {
        super(x, y);
        this.c = c;
    }

    void print() {
        System.out.println(x + " " + y + " " + c);
    }
}

public class Superconstructor {
    public static void main(String[] args) {
        B obj = new B(12, 13, 14);
        obj.print();

    }

}
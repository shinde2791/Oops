//using super keyword with method

class A {
  String name = "jayesh shinde";

  void Printname() {
    System.out.println(name);
  }
}

class B extends A {
  String name = "sujal jagtap";

  void Printname() {
    super.Printname(); // in method B we have define super.Printname
    System.out.println(name);
  }
}

public class Superexample {
  public static void main(String[] args) {
    B obj1 = new B();
    obj1.Printname();
  }

}

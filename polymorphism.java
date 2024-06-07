// overridding
class Employee {
    void Detail(int employId, int bonus, int salary) {
        System.out.println("my current detail");
        System.out.println(employId);
        System.out.println(bonus);
        System.out.println(salary);
    }

}

class NewUpdate extends Employee {
      void Detail(int employId, int bonus, int salary){
        System.out.println("my updated detail");
        System.out.println(employId);
        System.out.println(bonus);
        System.out.println(salary);
      }
}

public class polymorphism {
    public static void main(String[] args) {
        Employee obj1=new Employee();
        obj1.Detail(2791, 5000, 27000);
        NewUpdate obj2=new NewUpdate();
        obj2.Detail(2791, 7000, 33000);
    }

}

interface  Detail{
     void employee();
     void employeeid();
     void position();
}

class Record implements Detail{
      public void employee(){
        System.out.println("jayesh");
      }
      public void employeeid(){
        System.out.println("27691");
      }
      public void position(){
        System.out.println("senior software enginner");
      }
}
public class abstractionpractise {
    public static void main(String[] args) {
    Detail emp1=new Record();
    emp1.employee();
    emp1.employeeid();
    emp1.position();
}
}

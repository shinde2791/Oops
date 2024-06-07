import java.util.Scanner;
public class encapsulation {
    private int age ;

 void setage(int age){
    if(age<0 || age > 100){
        System.out.println("you have enter invaild age ");
    }else{
        this.age=age;
    }
 }

 int getage(){
    return this.age;
     
 }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    encapsulation age1=new encapsulation();
    System.out.println("enter your age ");
    int age=sc.nextInt();
    age1.setage(age);
    int agevalue=age1.getage();
    System.out.println(agevalue);
  }
}

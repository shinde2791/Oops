public class encapsulationsecond {
    private int age ;
    private int pass;
    private int id;

    
    void setage (int age){
        this.age=age;
        
    }

    void setpass(int pass ){
        this.pass=pass;
    }

    int getage(){
        return this.age;
        
    }

    int getpass(){
        return this.pass;
    }

    public static void main(String[] args) {
        encapsulationsecond e1=new encapsulationsecond();
          e1.setage(27);
          e1.setpass(2791);

          int agevalue=e1.getage();
          System.out.println(agevalue);

          int passvalue=e1.getpass();
          System.out.println(passvalue);

          
          
    }
    
}

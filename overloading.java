public class overloading {
   static int sum(int a,int b){
    int sum=a+b;
    return sum;
  }

  static int sum(int a ,int b, int c){
    int sum=a+b+c;
    return sum;
  }
    static float sum(float a,float b){
       float sum=a+b;
       return sum;
    }
  
    static String name(String name,int num){
        String nav=name+num;
        return name;
    }
    public static void main(String[] args) {
        int sum1= sum(27, 9);
        System.out.println(sum1);
        int sum2=sum(27, 9, 2002);
        System.out.println(sum2);
        float sum3=sum(33.3f, 44.4f);
        System.out.println(sum3);
        String name=name("jayesh", 27);
        System.out.println(name);

    }
  }



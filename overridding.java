class employee {
    String name = "jayesh";
    String position = "DevOps Engineer";
    int Id = 2791;
    double salary = 75000;

    public void detail() {
        System.out.println("the name of first employe" + name);
    }
}

class newemploye extends employee {
    // String name;
    public void detail() {
        System.out.println("the name of second employe" + name);
    }
}

class new2employee extends employee {
    public void detail() {
        System.out.println("the name of third employe " + name);
    }
}

class new3employee extends employee {
    String name = "vikram shinde";
    String position = "software testing";
    int Id = 07;
    double salary = 75000;

    public void detail() {
        System.out.println(name);
        System.out.println(position);
        System.out.println(Id);
        System.out.println(salary);
    }
}

public class overridding {
    public static void main(String[] args) {

        employee e1 = new employee();
        // e1.detail();

        new3employee e3 = new new3employee();

        e3.name = "mayur";
        e3.detail();
        new2employee n4=new new2employee();
        n4.name="sru";
        n4.detail();


    }
}

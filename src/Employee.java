public class Employee {
    String name;
    String post;
    String eAddress;
    String pNumber;
    int salary;
    int age;


    Employee (String name, String post, String eAddress, String pNumber, int salary, int age) {
        this.name = name;
        this.post = post;
        this.eAddress = eAddress;
        this.pNumber = pNumber;
        this.salary = salary;
        this.age = age;
    }

    public void printEmpl() {
        System.out.println(name + ", " + post + ", " + eAddress + ", " + pNumber + ", " + salary + ", " + age);
    }

}

//DONE

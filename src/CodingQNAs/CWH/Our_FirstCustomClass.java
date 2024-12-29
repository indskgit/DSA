package CodingQNAs.CWH;

class Employee {
    int id;
    String name;
    int salary;

    public void print() {

        System.out.println("your id is : " + id);
        System.out.println("your name is : " + name);
        System.out.println("Your Salary is : " + salary);
    }
}

public class Our_FirstCustomClass {
    public static void main(String[] args) {

        Employee sk = new Employee();
        Employee skp = new Employee();
        sk.id = 54;
        sk.name = "sk";
        sk.salary = 900000;

        skp.id = 007;
        skp.name = "Sauarbh Kumar Pandey";
        skp.salary = 1250000;

        sk.print();

        skp.print();
    }
}
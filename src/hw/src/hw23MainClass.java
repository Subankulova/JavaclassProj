package hw.src;

public class hw23MainClass {
    public static void main(String[] args) {
        System.out.println("Name: " + hw23Class.name);
        System.out.println("Age: " + hw23Class.age);
        System.out.println("Salary: " + hw23Class.salary);

        System.out.println("===================");

        hw23Class person = new hw23Class();

        person.name = "Sasha";
        person.age = 25;
        person.salary = 27000;

        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);
        System.out.println("Salary: " + person.salary);


    }
}

package class36;

class Person {
    String name;
    int age;
    Person (String name, int age){
        this.name = name;
        this.age = age;
    }
}

public class PassingObjectExample {
    public static void main(String[] args) {
        Person aizhan = new Person("Aizhan", 17);
        Person madina = new Person("Madina", 15);

        printObjectData(aizhan);
        printObjectData(madina);

    }
    public static void printObjectData(Person person){
        System.out.println(person.age);
        System.out.println(person.name);


    }
}

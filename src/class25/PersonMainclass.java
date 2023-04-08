package class25;

public class PersonMainclass {
    public static void main(String[] args) {
        //create reference of class
        classes aidai;
        //initialize memory for the object

        classes dana = new classes();
        classes azat = new classes();
        System.out.println(dana.name);

        dana.age = 34;
        azat.age = 14;

        dana.name = "Danaker";
        azat.name = "Azat";
        dana.run();
        azat.eat();

    }
}

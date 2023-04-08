package hw.src;
//Create a class Person with different properties of a person (Make all variables private)
//Create getters and setters
//Create a MainClass and create object of Person class
//Use the object to call setters to set the values of variables
//Use the object to call getters to get the values of variables
class Person {
    private int age;
    private String name;
    private String eyecolor;
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getEyecolor() {
        return eyecolor;
    }
    public void setEyecolor(String eyecolor){
        this.eyecolor = eyecolor;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}
public class hw29 {
    public static void main(String[] args) {
        Person man = new Person();
        man.setName("Aibek");
        man.setEyecolor("blue");
        man.setAge(23);
        System.out.println("What's name?- "+man.getName());
        System.out.println("What's eye color?- "+man.getEyecolor());
        System.out.println("What's age? - "+man.getAge());
    }
}

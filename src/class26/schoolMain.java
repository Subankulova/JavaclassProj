package class26;

public class schoolMain {
    public static void main(String[] args) {
        school stud = new school();
        school stud1 = new school("Alina", 15, "female");
        school stud2 = new school();

        stud2.name = "Azat";
        stud2.gender = "male";
        stud2.age = 17;



        System.out.println("My name is " + stud1.name + " I'm " + stud1.age+ " years old, " + " my gender is " + stud1.gender);
        System.out.println("My name is " + stud2.name + " I'm " + stud2.age+ " years old, " + " my gender is " + stud2.gender);
    }
}

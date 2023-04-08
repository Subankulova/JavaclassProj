package hw.src;

class Pizza {
    void withPineapple(int piece) {
        System.out.println("My Pizza with " + piece + " pieces of Pineapple");
    }

    void withsausage(String piece) {
        System.out.println("My Pizza with " + piece + " pieces of sausage");
    }
}

public class hw27 {
    public static void main(String[] args) {
        //Task 2:
        //Create a Class of your choice
        //Identify and create three different methods
        // inside the class with the same name (the argument can be different)
        Pizza a = new Pizza();
        a.withPineapple(8);
        a.withsausage("ten");

    }
}

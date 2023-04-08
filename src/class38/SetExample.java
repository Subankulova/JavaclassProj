package class38;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();

        fruits.add("Potato");
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Banana");

        for(String fruit : fruits){
            System.out.println(fruit);
        }

    }
}

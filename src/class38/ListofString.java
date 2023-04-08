package class38;

import java.util.ArrayList;
import java.util.List;

public class ListofString {
    public static void main(String[] args) {
        List<String> listOfFruit = new ArrayList<>();

        listOfFruit.add("Banana");
        listOfFruit.add("Orange");
        listOfFruit.add("Mango");
        listOfFruit.add("Apple");
        System.out.println(listOfFruit);

        if(listOfFruit.contains("Banana")){
            listOfFruit.remove(2);
        }
        System.out.println(listOfFruit);

    }
}

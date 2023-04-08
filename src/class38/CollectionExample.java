package class38;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {
        List<Integer> listOfNum = new ArrayList<>();
        // Store data into the list
        listOfNum.add(40);
        listOfNum.add(34);
        listOfNum.add(65);
        listOfNum.add(32);
        listOfNum.add(2,50);
        System.out.println(listOfNum.contains(65));//true

        Collections.sort(listOfNum);
        Collections.reverse(listOfNum);
        System.out.println(listOfNum);

    }
}

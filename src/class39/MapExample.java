package class39;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String,Integer> ageOfPeople = new HashMap<>();

        ageOfPeople.put("Dana",43);
        ageOfPeople.put("Azat",23);
        ageOfPeople.put("Taira",22);
        ageOfPeople.put("Madina",21);
        ageOfPeople.put("Aidai",20);

        System.out.println(ageOfPeople);
        System.out.println(ageOfPeople.get("Aidai"));
        System.out.println(ageOfPeople.isEmpty());
        System.out.println(ageOfPeople.size());
        System.out.println(ageOfPeople.containsKey("Dana"));
        System.out.println(ageOfPeople.containsKey(43));


    }
}

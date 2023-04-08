package class39;

import java.util.*;

public class MapKey {
    public static void main(String[] args) {
        Map<String,Integer> ageOfPeople = new HashMap<>();

        ageOfPeople.put("Dana",43);
        ageOfPeople.put("Azat",23);
        ageOfPeople.put("Taira",22);
        ageOfPeople.put("Madina",21);
        ageOfPeople.put("Aidai",20);

        //print all keys from map
        Set<String> keys = ageOfPeople.keySet();
        for(String key : keys){
            System.out.println(key+"="+ageOfPeople.get(key));
        }
        //print all the values from the map
       Collection<Integer> values = ageOfPeople.values();
        for(int value : values){
            System.out.println(value);

        }

    }
}

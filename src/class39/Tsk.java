package class39;

import java.util.*;

public class Tsk {
    public static void main(String[] args) {
        Map<List<String>, String> food = new HashMap<List<String>, String>();
        List<String> boiledRice = new ArrayList<>();
        boiledRice.add("water");
        boiledRice.add("raw rice");
        boiledRice.add("air");
        food.put(boiledRice, "Boilde rice");
        List<String> vegetableCurry = new ArrayList<>();
        vegetableCurry.add("vegetables");
        vegetableCurry.add("salt");
        vegetableCurry.add("oil");
        food.put(vegetableCurry,"vegetable curry");
        List<String> dal = new ArrayList<>();
        dal.add("water");
        dal.add("pulse");
        dal.add("salt");
        food.put(dal,"Dal");

        System.out.println(food);
    }
}

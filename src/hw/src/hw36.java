package hw.src;

import java.util.*;

//Task 1: Write a program to print unique words from the Given String (Yesterday's task 3)
//Logic hint: Create a two set with one set holding all the words
// and the second set will hold duplicate words and then do set1 - set2
public class hw36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Set<String> words = new HashSet<>();
//        Set<String> duplicate = new HashSet();
//        String str = sc.nextLine();
//
//        String[] listOfWords = str.split(" ");
//        for(int i=0; i<listOfWords.length;i++) {
//            if (words.add(listOfWords[i].replace(",", "")) == false) {
//                if (words.add(listOfWords[i])) {
//                    words.add(listOfWords[i]);}
//                else duplicate.add(listOfWords[i]);
//            }
//        }
//        words.removeAll(duplicate);
//        System.out.println("Duplicate words: " + duplicate);
//        System.out.println("Unique words: " + words);


//  Task 2: Write a program to print the frequency of each character from the String
//  - Do not use direct method from the Collections class
//Example
//Input - This is my collection program
//Output - { =4, a=1, c=2, e=1, g=1, h=1, i=3, l=2, m=2, n=1, o=3, p=1, r=2, s=2, t=2, y=1}
        String str = "java program";

        // hashmap to store the frequency of each character.
        // here, characters are stored as key and frequency as value.
        HashMap<Character, Integer> map = new HashMap<>();

        // traverse through each character in the string
        for (int i = 0; i < str.length(); i++) {
            // store each character in ch
            Character ch = str.charAt(i);

            // if ch is not equal to ' '
            if (ch != ' ') {
                //check whether the hashmap contains the character or not
                // if the character is already present in the hashmap
                if (map.containsKey(ch)) {
                    // fetch the character's frequency
                    int count = map.get(ch);
                    // increase the count by 1 and update it.
                    map.put(ch, count + 1);
                }
                // if the character is not present in the hashmap
                else {
                    // set its frequency to 1.
                    map.put(ch, 1);
                }
            }

        }

        System.out.println("Given string = " + str);

        // print the character along with its frequency
        // in the same order as the characters appear in the string.
        for (int i = 0; i < str.length(); i++) {
            // Print only if the character is not printed before
            // and ignore the spaces.
            if (str.charAt(i) != ' ' && map.get(str.charAt(i)) != -1) {
                // print the character and frequency
                System.out.println(str.charAt(i) + " - " + map.get(str.charAt(i)));
                // set value to -1 to avoid printing visited characters
                map.put(str.charAt(i), -1);
            }
        }
    }
}


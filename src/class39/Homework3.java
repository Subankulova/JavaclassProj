package class39;

import java.util.*;

//Task 3: Write a program to print unique words from the Given String
//        Example:
//        Input - well, collection is very easiest topic in java and it is very useful as well
//        Output - collection easiest topic in java and it useful as
public class Homework3 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Set<String> words = new HashSet<>();
        System.out.println("Enter any string");
        String str = sc.nextLine();
       //Split string by space to get collection of words
        String[]listOfWords = str.split(" ");
       //add each word from array to set & if it's duplicate, remove that word from set
        for(int i=0; i<listOfWords.length;i++){
            if(words.add(listOfWords[i].replace(",",""))==false){
              words.remove(listOfWords[i]);
            }
        }
        System.out.println(words);


    }
}

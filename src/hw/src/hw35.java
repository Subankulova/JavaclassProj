package hw.src;

import java.util.*;

//Task 1: Write a program to get five numbers from the user and sort them in ascending order using the list
public class hw35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers");
        List<Integer> listOfData = new ArrayList<>();
        for(int i = 0; i<5; i++) {
            int data = sc.nextInt();
            listOfData.add(data);
        }
        Collections.sort(listOfData);
        System.out.println(listOfData);

//Task 2: Write a program to get five numbers from the user and print all numbers in reverse sequence
//Example:
//Input -  45, 67, 23, 12, 43
//Output - 43, 12, 23, 67, 45

        System.out.println("Enter 5 numbers");
        List<Integer> listOfNumber = new ArrayList<>();
        for(int i = 0; i<5; i++) {
            int number = sc.nextInt();
            listOfNumber.add(number);
        }
        Collections.reverse(listOfNumber);
        System.out.println(listOfNumber);


// Task 3: Write a program to print unique words from the Given String
//Example:
//Input - well, collection is very easiest topic in java and it is very useful as well
//Output - collection easiest topic in java and it useful as well

//        String str = "well, collection is very easiest topic in java and it is very useful as well";
//        uniqueWords(str);
//    }
//
//    static void uniqueWords(String str) {
//      Set<String> words = new HashSet<>();
//        System.out.println("Enter any string");
//        String str = sc.nextLine();
//       //Split string by space to get collection of words
//        String[]listOfWords = str.split(" ");
//       //add each word from array to set & if it's duplicate, remove that word from set
//        for(int i=0; i<listOfWords.length;i++){
//            if(words.add(listOfWords[i].replace(",",""))==false){
//              words.remove(listOfWords[i]);
//            }
//        }
//        System.out.println(words);

        }
    }


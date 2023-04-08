package class16;

public class While2 {
    public static void main(String[] args) {
        //write a program that prints out from 10 to 0

        int i = 10;
        while (i >= 0) {
            System.out.println(i);
            i--;
        }

        //write a program that will print out
        //*
        //**
        //***
        //****
        //*****
        String star = "*";
        int iteration = 0;
        while (iteration < 5) {
            System.out.println(star);
            star = star.concat("*");
            iteration++;
        }

        //write a program that will print out
        //*****
        //****
        //***
        //**
        //*

        String str = "*****";
        while (str.length() > 0) {
            System.out.println(str);
            str = str.substring(0, str.length() - 1);
        }

        // write a program that will print out even numbers
        // untill 20
        // 2-4-6-8-10-12-14-16-18-20

        int num = 0;
        while (num < 20) {
            num += 2;
            System.out.println(num);
        }
        //Write a program
        //that will count number of vowel characters and
        // consonant characters in a String
        //4 - vowels
        //8 - consonants including the space

        String sttr = "Hello Devxers";    //Given String
        System.out.println("The String is: " + sttr);
        sttr = sttr.toLowerCase();
        int vcount = 0, ccount = 0;    //Variables to count the vowels and consonants
        int l = 0;
        while (l < sttr.length()) {
            if (sttr.charAt(l) == 'e' || sttr.charAt(l) == 'o') {
                vcount++;
            } //Increment each time vowel encounters
            else if (sttr.charAt(l) >= 'a' && sttr.charAt(l) <= 'z') {
                ccount++;
            }  //Increment each time consonant encounters
            l++;
        }
        //Print the total number of vowels
        System.out.println("The total number of vowels is: " + vcount);
        //Print the total number of consonants
        System.out.println("The total number of consonants is: " + ccount);

        //APPROACH
        //Declare a variable as String sttr;
        //Declare and initialize two integer counter variable as int vowCount=0 and consCount=0;
        //The user asked to enter a string to count vowels and consonants
        //A while-loop is used to count total vowels and consonants of the given string
        //It is initialized as l=0, and checks condition whether l<str.length();  and executes the loop until the given condition becomes true
        //Use an if statement to test vowel, if the test expression is true,  vowCount becomes vowCount + 1(vowCount=vowCount+1)
        //When the if-statement is false, control moves to else if and checks the test expression of else-if
        //If the test expression of else-if is true,  consCount becomes consCount + 1(consCount =consCount +1)
        //If the test expression of else if  is false, control skips from the loop
        //Finally, the program displays the number of vowels and consonants of the given string.
    }
}
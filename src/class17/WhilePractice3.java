package class17;

public class WhilePractice3 {
    public static void main(String[] args) {
       //write a program that prints out
        //every  other chatacter of a sctring
        //ex: Java
        // a a
        //Hello
        //e l
        //World
        //o l
        //Mission Impossible
        // i s o m o s i l

        String word = "Java";
        int a = 1;
        while(a < word.length()){
            char c = word.charAt(a);
            a+=2;
            System.out.println(c);
            }

        }
    }


package class38;

import java.util.HashSet;
import java.util.Set;

//Find duplicate characters in the String
public class DuplicateNumbers {
    public static void main(String[] args) {
        String str = "We are almost finishing java";
        Set<Character> set = new HashSet<>();
        Set<Character> dupl = new HashSet<>();

        for(int i = 0; i<str.length(); i++){
            if(set.add(str.charAt(i))== false){
                System.out.println(dupl.add(str.charAt(i)));
            }
        }
    }
}

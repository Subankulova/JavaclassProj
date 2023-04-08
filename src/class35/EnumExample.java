package class35;

import java.util.HashMap;
import java.util.Map;

enum DaysofWeek{
    SUNDAY, MONDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
enum MarksOfStudent{
    AIDAI(45), EMILY(33), AZAT(55), TAIRA(55), MADINA(90), BEGIMAI(54), JANAT("Pass");
    int marks;
    String result;
    MarksOfStudent(int marks){
        this.marks = marks;
    }
    MarksOfStudent(String result){
        this.result = result;
    }
    public String getResult(){
        return result;
    }
}
public class EnumExample {
    public static void main(String[] args) {
//        Map<String, String> dataOnInput = new HashMap<>();
//        dataOnInput.put("amount","100");
//        dataOnInput.put("description","Enjoy your gift");
//        dataOnInput.put("purpose","Gift");
//
//        Map<String, String> dataOnReview = new HashMap<>();
//        dataOnReview.put("amount","1000");
//        dataOnReview.put("description","Enjoy your gift");
//        dataOnReview.put("purpose","Gift");
        System.out.println(MarksOfStudent.AZAT);
        System.out.println(MarksOfStudent.AZAT.marks);
        System.out.println(MarksOfStudent.JANAT.getResult());

        MarksOfStudent[] listOfMarks = MarksOfStudent.values();

    }
}

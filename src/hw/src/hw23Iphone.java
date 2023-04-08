package hw.src;

public class hw23Iphone {
    static String name = "Iphone";
    static String gpu = "4-core graphics";
    String model = " ";
    int memory;
    String status;


    hw23Iphone(String modelFromUser, int memoryFromUser){
        model = modelFromUser;
        memory = memoryFromUser;


    }
    hw23Iphone(String modelFromUser){
        model = modelFromUser;
        memory = 128;

    }
    hw23Iphone(){
        model = "13Pro";
        memory = 1;

    }

    void color(String color){
        if(color.equalsIgnoreCase("White")) {
            status = "is not Available";
        }
        else status = "is Available";

    }





}

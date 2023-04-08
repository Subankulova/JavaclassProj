package hw.src;

public class hw23IphoneMain {
    public static void main(String[] args) {
        hw23Iphone phone1 = new hw23Iphone("12ProMax", 512);
        hw23Iphone phone2 = new hw23Iphone( "14");
        hw23Iphone phone3 = new hw23Iphone();

        phone1.color("White");
        phone2.color("Purple");
        phone3.color("Green");


        System.out.println(hw23Iphone.name + " " + phone1.model + " with " + phone1.gpu + " and memory " + phone1.memory + " GB " + phone1.status);
        System.out.println(hw23Iphone.name + " " + phone2.model + " with " + phone2.gpu + " and memory " + phone2.memory + " GB " + phone2.status);
        System.out.println(hw23Iphone.name + " " + phone3.model + " with " + phone3.gpu + " and memory " + phone3.memory + " TB " + phone3.status);


    }
}

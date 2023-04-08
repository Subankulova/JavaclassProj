package class27;

public class IphoneClass {
    static String name = "Iphone";
    static int ram = 4;
    int memory;
    String color;
    static int mp = 12;
    int cost = 1200;
    public void status(){
        String color = "blue";
        System.out.println("it has Color - " + color);
    }
    static void Camera(){
        System.out.println("Camera is " + IphoneClass.mp + "mp");
    }

//    public static void main(String[] args) {
//        System.out.println(IphoneClass.name + " with RAM " +  IphoneClass.ram);
//        IphoneClass c = new IphoneClass();
//        c.status();
//    }

}

package hw.src;

public class studentsMain {
    public static void main(String[] args) {
        students jannat = new students("Jannat", 32, "SDET");
        students saiid = new students("Saiid", 19, "Data science");
        students alishan = new students("Alishan", 16, "Fullstack");

        System.out.println(jannat.toString());
        System.out.println(saiid.toString());
        System.out.println(alishan.toString());


    }
}

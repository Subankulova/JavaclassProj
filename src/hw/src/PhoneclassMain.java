package hw.src;

public class PhoneclassMain {
    public static void main(String[] args) {
        Phoneclass aidai = new Phoneclass("Xiaomi", 11, 128);
        Phoneclass taira = new Phoneclass("Iphone", 12, 256);
        Phoneclass sezim = new Phoneclass("Xiaomi", 12, 512);

        aidai.available(56);
        taira.available(100);
        sezim.available(154);
        System.out.println("Aidai has a " + aidai.name + aidai.model + " and available " + aidai.memory + "gb");
        System.out.println("Taira has a " + taira.name + taira.model + " and available " + taira.memory + "gb");
        System.out.println("Sezim has a " + sezim.name + sezim.model + " and available " + sezim.memory + "gb");
    }
}

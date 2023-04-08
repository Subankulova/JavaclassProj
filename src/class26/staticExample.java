package class26;

class Car {
    static int price;

    Car() {
        price++;
    }
}

public class staticExample {
    public static void main(String[] args) {
        Car audi = new Car();
        System.out.println(audi.price);
        Car bmw = new Car();
        System.out.println(bmw.price);
        Car honda = new Car();
        System.out.println(honda.price);
    }
}

package hw.src;
//Task 1:
//Create a Base Class called Phone (with methods - call(), text(), and repair() )
//Create two child classes AndroidPhone and IPhone & override repair() method from the Phone class
//Create another class called ServiceCenter with the method servicePhone()
//Create a MainClass with objects of AndroidPhone, IPhone and ServiceCenter
//Using ServiceCenter class object call servicePhone() method and pass an object of androidPhone or iPhone
//servicePhone() method will call repair() method AndroidPhone or IPhone class based on the object we are passing
class Phone{
    void call(){
        System.out.println("You can call");
    }
    void text(){
        System.out.println("You can text");
    }
    void repair() {
        System.out.println("Phone needs to be repaired");

    }

}
class AndroidPhone extends Phone{
    @Override
    void repair(){
        System.out.println("AndroidPhone needs to be repaired");
    }
}
class IPhone extends Phone{
    @Override
    void repair(){
        System.out.println("IPhone needs to be repaired");

    }
}
class ServiceCenter{
    void servicePhone(Phone d){
        d.repair();

    }
}
public class hw28Phone {
    public static void main(String[] args) {
        AndroidPhone a = new AndroidPhone();
        IPhone b = new IPhone();
        ServiceCenter c = new ServiceCenter();
        c.servicePhone(a);
        c.servicePhone(b);

    }
}


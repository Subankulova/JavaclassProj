package class30;
class shape{
    void draw(){

    }
    void erase(){
        System.out.println("Erasing Shape");
    }
}
class circle extends shape{
@Override
    void draw(){
    System.out.println("Drawing circle");
}
}
class squre extends shape{
    @Override
    void draw(){
        System.out.println("Drawing squre");
    }
}
public class OverrideAssignment {
    public static void main(String[] args) {
        circle c = new circle();
        squre v = new squre();
        c.draw();
        v.draw();
    }
}

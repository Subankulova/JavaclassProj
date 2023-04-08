package class36;

public class task {
    public static void main(String[] args) {
    int data[] = {1,2,3,5};
    String str = null;
    try{
        System.out.println(str.contains("h"));
        System.out.println(str.length());
    }catch(Exception e){
        System.out.println("wrong");
   }
//        System.out.println(data[0]);
    try{
        System.out.println(data[4]);
    }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Out of bound");
    }finally {
        System.out.println("i'm always executed");
    }
    }
}

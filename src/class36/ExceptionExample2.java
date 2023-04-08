package class36;

public class ExceptionExample2 {
    public static void main(String[] args) {
        String str = null;
        try{
            System.out.println(str.length());
        }catch(Exception e){
            System.out.println("Something went wrong");
        }

    }
}

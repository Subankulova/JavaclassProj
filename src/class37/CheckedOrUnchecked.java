package class37;

public class CheckedOrUnchecked {
    public static void main(String[] args) {
        System.out.println("hello");
        try {
            Thread.sleep(5000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("How are you");
    }
}

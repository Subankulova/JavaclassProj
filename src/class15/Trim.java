package class15;

public class Trim {
    public static void main(String[] args) {
        String str = "Elon ";
        boolean isEqual = str.equals("Elon");
        System.out.println(isEqual);
        String answer = "yes ";
        boolean yesOrNo = answer.equalsIgnoreCase("yes");
        System.out.println(yesOrNo);
        System.out.println(str.trim());
    }
}

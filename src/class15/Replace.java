package class15;

public class Replace {
    public static void main(String[] args) {
        String str = "earth is flat";
        String str2 = str.replace('a','W' );
        System.out.println(str2);

        String str3 = "public static void main(String{} args)";
        str3 = str3.replace('{','[').replace('}',']');
        System.out.println(str3);

        String str11 = "I hate Java";
        System.out.println(str11.replace("hate","love"));
    }
}

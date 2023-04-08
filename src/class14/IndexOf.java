package class14;

import java.sql.SQLOutput;

public class IndexOf {
    //indexOf(String str) =. returns the index of the first occurance
    public static void main (String[]args){
        String str = "tik tak";
        System.out.println(str.indexOf("tak"));
        System.out.println(str.indexOf("a"));

        String str2 = "bla bla bla";
        System.out.println(str2.indexOf("dlkfjwkjfkrw"));//-1
        System.out.println(str2.indexOf("bla"));
        System.out.println(str2.indexOf("bla"));

        String str3 = "Macbook Air, Nike Air, Ipod Air";
        System.out.println(str3.indexOf("Air",10));
        System.out.println(str3.indexOf("Air",19));

        String str4 = "Lala polluza lala land la lake";
        System.out.println(str4.indexOf("La",5));
        System.out.println(str4.indexOf("la",5));

        String str5 = "Java Developer, Java Coding";
        System.out.println(str5.lastIndexOf("Java"));

        String str6 = "Almazova";
        int last2Chars = str6.lastIndexOf("va");
        System.out.println(last2Chars);
    }
}

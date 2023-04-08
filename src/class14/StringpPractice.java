package class14;

public class StringpPractice {
    public static void main (String[]args){
        String str = "<html>";
        str+="<body>";
        str+="<h1> Hello Devx</h1>";
        str+="</body>";
        str+="</html>";
        System.out.println(str);

        String str1 = "public class Hello";
        str1.concat("{");
        //\n -> create new line
        //\t -> create a tab.
        //\" -> add " as a String
        //\\ -> add \ as a String
        str1 = str1.concat("\n\t{");
        System.out.println(str1);

        String str3 = "I ";
        str3.concat(" love ");
        str3 = str3.concat(" Java");
        System.out.println(str3);
    }
}

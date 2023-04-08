package class15;

public class Replace2 {
    public static void main(String[] args) {
        String str = "DevX adventures world";
        int indexofFirstSpace = str.indexOf(" ");
        String noDevxEReplaced = str.substring(indexofFirstSpace).replaceFirst("e","X");
        String DevXOnly = str.substring(0, indexofFirstSpace);
        String finalResult = DevXOnly.concat(noDevxEReplaced);
        System.out.println(finalResult);

    }
}

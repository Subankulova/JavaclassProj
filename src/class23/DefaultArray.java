package class23;

public class DefaultArray {
    public static void main (String[] args){
        int lisOfNum[]= new int[10];
        lisOfNum[0] = 10;
        lisOfNum[1] = 20;
        lisOfNum[2] = 30;

        System.out.println(lisOfNum.length);

        for(int i = 0; i<=lisOfNum.length; i++){
            System.out.println(lisOfNum[i]);
        }

    }
}

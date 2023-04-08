package class21;

public class nestedFor {
    public static void main(String[] args) {
       for(int i = 1; i<=5; i++){
           for(int a = 1; a<=5-i; a++){
               System.out.print(" ");
           }
           for(int j = 1; j<=i; j++){
               System.out.print(j);
           }

           System.out.println();
       }

///////////////////
        for(int e = 1; e<=2; e++){
            for(int r = 1; r<=e; r++){
                System.out.print(r);
            }

            System.out.println();
        }
    }
}

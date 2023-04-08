package class24;

public class ForEachLoop {
    public static void main(String[] args) {
        int data[] = {43, 56, 2, 6, 78, 32};

//        for(int i = 0; i< data.length; i++){
//            System.out.println(data[i]);
//        }
        for(int temp : data){
            System.out.println(temp);
        }
    }
}

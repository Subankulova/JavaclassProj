package class24;
//find a smallest numb from the array using for each loop
public class findSmallestNumb {
    public static void main(String[] args) {
        int data[] = {43, 56, 2, 6, 78, 32};
        int min = data[0];
        for(int i = 0; i<data.length; i++){
            if(min>data[i]){
                min=data[i];
            }
        }
        System.out.println(min);
    }
}

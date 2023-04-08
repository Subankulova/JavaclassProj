package class11;

public class switch1 {
    public static void main(String[] args) {
        int rate = 1;
        switch (rate) {
            case 1:
            case 2:
            case 3:
                System.out.println("bad service");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("ok service");
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("good service");
                break;
            default:
//                throw new NumberFormatException("Invalid rating");
                break;

        }
       /* String shipmentState= "Hawaii";
        switch (shipmentState) {
            case "Alaska":
            case "Hawaii":
                System.out.println("Shipment cost is $10");
            case "NY":
                System.out.println("Shipment cost is $5");
            case "Florida":
                System.out.println("Shipment cost is $7");
            case "California":
                System.out.println("Shipment cost is $12");
        }*/
    }
}
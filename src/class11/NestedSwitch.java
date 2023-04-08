package class11;

public class NestedSwitch {
    public static void main(String[] args) {
        String destination = "USA";
        double totalspending = -12;

            switch ((int) totalspending) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.println("$5");
                    break;
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    System.out.println("$10");
                    break;
                default:
                    switch (destination) {
                        case "USA":
                            System.out.println("$ " + totalspending * 0.1);
                            break;
                        case "Canada":
                            System.out.println("$ " + totalspending * 0.15);
                            break;
                        case "Europe":
                            System.out.println("$ " + totalspending * 0.2);
                            break;
                        default:
                            System.out.println("$ " + totalspending * 0.25);
                            break;


                    }
            }

        }

    }


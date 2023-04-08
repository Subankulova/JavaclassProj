package class12;

public class methodsintro {
    public static void main(String[] args) {
        int year = 2023;
        double targetSalary = 130000;
        System.out.println("hello" + year);
        System.out.println("my target salary is" + targetSalary);

        double taxAmount = calculateTax(100000);
        System.out.println(taxAmount);

    }

    public static double calculateTax(double annualSalary){
        if (annualSalary<=100000){
            return annualSalary * 0.10;
        }
        else {
            return annualSalary * 0.15;
        }
    }


}

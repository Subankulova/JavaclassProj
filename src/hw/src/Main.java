public class Main {
    public static void main(String[] args) {
        // your credit score
        // your marital status
       //  number of children
        // If
            // credit score is more than 680
            // married
           //  more than 2 children

        boolean giveFamilyHealthInsuranceCoverage;
        int creditscore = 800;
        boolean married = false;
        int numberofchildren = 0;

        giveFamilyHealthInsuranceCoverage = creditscore>680 && married && numberofchildren > 2;


        System.out.println(giveFamilyHealthInsuranceCoverage);


        }
    }




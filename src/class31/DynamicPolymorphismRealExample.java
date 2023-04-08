package class31;
class Bank {
    void withdraw(){
        System.out.println("Parent withdraw");
    }
    void deposit(){
        System.out.println("Parent deposit");
    }
    void displayRateofInterest(){
        System.out.println("Parent display rate of interest");
    }
}
class ChaseBank extends Bank{
    @Override
    void displayRateofInterest(){
        System.out.println("Child rate of interest");
    }
    void takeQuikLoan(){
        System.out.println("Child quick take loan");
    }

}


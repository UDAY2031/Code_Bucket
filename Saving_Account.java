class SavingAccount{
    static int AnnualInterestRate;
    private double SavingsBalance;
    SavingAccount(double s){
        SavingsBalance=s;
    }
    static void modifyAnnualInterest(int x){
        AnnualInterestRate=x;
    }
    void calculateMonthlyInterest(){
        double d = (SavingsBalance*AnnualInterestRate)/12;
        SavingsBalance+=d;
    }
    void display(){
        System.out.println(SavingsBalance);
    }
}
class Saving_Account{
    public static void main(String[] args) {
        SavingAccount s1 = new SavingAccount(2000);
        SavingAccount s2 = new SavingAccount(3000);
        SavingAccount.modifyAnnualInterest(4);
        s1.calculateMonthlyInterest();
        s2.calculateMonthlyInterest();
        s1.display();
        s2.display();
        SavingAccount.modifyAnnualInterest(5);
        s1.calculateMonthlyInterest();
        s2.calculateMonthlyInterest();
        s1.display();
        s2.display();
    }
}
package mack.ps1;

public class SavingAccount extends BankAccount{
    
    @Override
    public void deposit(double amount){
        super.deposit(amount);
        double aux = getBalance();
        super.deposit((aux*0.1));
    }
}

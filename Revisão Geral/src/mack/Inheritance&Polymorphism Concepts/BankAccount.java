package mack.ps1;


public class BankAccount {
    private int accountNumber;                    // número da conta
    private static int lastAccountNumber = 1000;  // Último número utilizado de conta
    private double balance;                       // saldo da conta

    public BankAccount() {
        // Constrói uma conta bancária com saldo zero
        accountNumber=lastAccountNumber++;
        balance = 0;
    }

    public BankAccount(double balance) {
        // Constrói uma conta bancária com um determinado saldo inicial
        accountNumber=lastAccountNumber++;
        this.balance = balance;
    }

    public void deposit(double amount) {
        // Deposita valor na conta bancária
        balance += amount;
    }

    public void withDraw(double amount) throws WithdrawException{
        // Retira valor da conta bancária
        if(balance<amount){
            throw new WithdrawException(accountNumber, balance);
        }
        balance -= amount;
    }

    public double getBalance() {
        // Consulta o saldo da conta bancária
        return balance;
    }
    
    public int getAccountNumber(){
        // Consulta o número da conta bancária
        return accountNumber;
    }
}

package mack.ps1;

public class Principal {
    public static void main(String[] args) throws Exception{
        Bank banco = new Bank();
        banco.addAccount(new BankAccount(500));
        banco.addAccount(new BankAccount(400));
        
        banco.deposit(1000, 100.0);
        
        banco.withDraw(1001, 1000);
        System.out.println(banco.getBalance(1001));
    }
    
}

package mack.ps1;


public class AccountNumberException extends Exception{
    private int numeroConta;

    public AccountNumberException(int numeroConta){
        this.numeroConta = numeroConta;
    }
    
    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    
    
    
}

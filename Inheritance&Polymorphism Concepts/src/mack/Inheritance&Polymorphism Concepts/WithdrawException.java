package mack.ps1;

public class WithdrawException extends Exception{
    private int numeroConta;
    private double saldo;
    
    public WithdrawException(int numeroConta, double saldo){
        this.numeroConta=numeroConta;
        this.saldo=saldo;
    }
    /**
     * @return the numeroConta
     */
    public int getNumeroConta() {
        return numeroConta;
    }

    /**
     * @param numeroConta the numeroConta to set
     */
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    
}
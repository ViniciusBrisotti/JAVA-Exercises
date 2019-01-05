package mack.ps1;

public class Bank {
    private BankAccount contas[];
    private int qteContas = 0;
    
    public Bank(){
        contas = new BankAccount[100];
        
    }
    
    public void addAccount(BankAccount novaConta){
        contas[qteContas]=novaConta;
        qteContas++;
    }
    
    public Bank(int qteContas){
        contas = new BankAccount[qteContas];
    }
    
    public void deposit(int accountNumber, double amount) throws AccountNumberException{
        boolean achou = false;
        for(int i=0; i<contas.length;i++){
            if(contas[i] != null && contas[i].getAccountNumber() == accountNumber){
                contas[i].deposit(amount);
                achou = true;
                break;
            }
        }
        if(!achou)
            throw new AccountNumberException(accountNumber);
    }
    
    public void withDraw(int accountNumber, double amount){
        for(int i=0; i<contas.length;i++){
            if(contas[i] != null && contas[i].getAccountNumber() == accountNumber){
                try{
                    contas[i].withDraw(amount);
                }catch(WithdrawException wex){
                    System.out.println("Saque alem do permitido para a conta "+wex.getNumeroConta() +"com saldo "+wex.getSaldo());
                }
                break;
            }
        }
    }
    
    public double getBalance(int accountNumber) {
        for(int i=0; i<contas.length;i++){
            if(contas[i] != null && contas[i].getAccountNumber() == accountNumber){
                return contas[i].getBalance();
            }
        }
        return 0.0;
    }
}


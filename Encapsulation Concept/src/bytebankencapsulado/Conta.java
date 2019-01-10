
package bytebankencapsulado;


public class Conta {
    private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	//CONSTRUTOR
	
	public Conta( int agencia, int numero) { 
                this.agencia = agencia;
                this.numero = numero;
                System.out.println("estou criando uma conta" + " "+this.agencia);
    }

	
	
	
	

	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}
	
	
	public double getSaldo() {
		return this.saldo;
		
	}
	
	public void setSaldo(int numero) {
		this.numero = numero;
		
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
		
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
}

package bytebankencapsulado;

public class TestaGetSet {
	
	public static void main(String[] args) {
		
		Conta contaDoRafael = new Conta(0466,100112);
		contaDoRafael.setSaldo(0466);
		
		
		Cliente rafael = new Cliente();
		rafael.setNome("sanzio");
		contaDoRafael.setTitular(rafael);
		rafael.setProfissao("Suporte-TI");
		
		
		// em uma linha
		System.out.println(contaDoRafael.getTitular().getProfissao());
		
		// em duas linhas
		Cliente titularDaConta = contaDoRafael.getTitular();
        titularDaConta.setProfissao("programador");
        System.out.println(rafael.getProfissao());
		
		
		
		
		
		
	}

}

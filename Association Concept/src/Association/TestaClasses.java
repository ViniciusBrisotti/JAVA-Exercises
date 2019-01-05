package Association;


import Association.Atleta;
import Association.DadosFisicos;

public class TestaClasses {
    public static void main(String[] args) {
        
        // instanciado o objeto atleta com seus atributos
        Atleta a = new Atleta();
        DadosFisicos d  = new DadosFisicos();
        
        a.setNome("Pedro");
        a.setNumeroDaCamisa(12);
        a.setPosicao("Centroavante");
        a.isStatus();
        d.setPeso(98.0);
        d.setAltura(1.88);
        d.setIdade(25);
        
        
        
        
        a.dadosDoAtleta = d; // objeto a(atleta) tem uma var dadoDoAtleta na classe atleta que referencia outra clas
        a.exibirDados();
        
        a.dadosDoAtleta.calcularIMC();
        System.out.println("--");
        a.alteraStatus();
        
      
    }
    
}

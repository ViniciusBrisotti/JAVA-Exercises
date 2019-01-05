
package bytebankherdado;

public class ControleBonificacao {
    private double soma;

    public double getSoma() {
        return soma;
    }
    
    double registra(Funcionario f){
        return soma+=f.getBonificacao();  
    }
    
}


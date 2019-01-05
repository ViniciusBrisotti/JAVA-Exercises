
package exprogressao;


public class ArithProgression extends Progression{
    protected long inc; //incremento
    //herda as variáveis cur e first
    
    //construtor default inicializa o incremento com 1

    public ArithProgression() {
        this(1);//chamando o construtor com 1 parametro
    }
    //construtor que recebe um incremento incial
    public ArithProgression(long increment) {
        this.inc = increment;
    }
    
    
    //polimorfismo 
    //avanca a progressao acrescetnando o incremento atual
    @Override
    protected long nextValue(){
        cur+=inc;
        return cur;
    }//herda os demais metodos
    
    
    
}

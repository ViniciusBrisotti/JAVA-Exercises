
package exprogressao;

public class Progression {

    protected long first;
    protected long cur;
    
    /* construtor padrão*/
    Progression(){
        cur = first = 0;
    }
    
    //inicializa a prograssao com valor incial
    protected long firstValue(){
        cur = first;
        return cur;
    }
    
    //avanca a progressao para o proximo valor
    protected long nextValue(){
        return ++cur;
    }
    //imprime os primeiros valores n da progressao
    public void printProgression(int n){
        
        System.out.print(firstValue());
        
        for(int i=0; i<n; i++){
            System.out.print(" "+nextValue());
        }
        
        System.out.println(" - ");
        
    }
    
}


package exprogressao;

public class FibonacciProgression extends Progression{
   
    
    public FibonacciProgression(){
      cur = 1;  
    }
    
    @Override
    protected long firstValue(){
       first = 0;
       return  first;
    }
    
    @Override
    protected long nextValue(){
        long value = cur;
        
        cur += first;
        
        first = value;
        
        return cur;
    }
    
}

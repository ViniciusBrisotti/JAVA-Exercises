package exprogressao;


public class GeomProgression extends Progression{
   int multiplication;

    
    public GeomProgression(int multip){
               
        multiplication = multip;
        
    }
    
    @Override
    protected long firstValue(){
        cur = 1;
        return cur;
    }
    
    
    @Override
    protected long nextValue(){
        cur*=multiplication;
        return  cur;
    }
}

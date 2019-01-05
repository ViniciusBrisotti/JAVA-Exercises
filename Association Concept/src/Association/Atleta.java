package Association;


import Association.DadosFisicos;


public class Atleta{
    
    //atributos
    private String nome;
    private int numeroDaCamisa;
    private String posicao;
    private boolean status = false;
    DadosFisicos dadosDoAtleta; // associação a outra classe
    
    //get e sets
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getNumeroDaCamisa(){
        return numeroDaCamisa;
    }
    public void setNumeroDaCamisa(int numeroDaCamisa){
        this.numeroDaCamisa = numeroDaCamisa;
    }
    
    public String getPosicao() {
        return posicao;
    }
    public void setPosicao(String posicao){
        this.posicao = posicao;
    }
    
    public boolean isStatus() {
        return status;
    }
    
    //metodos
    
    public boolean alteraStatus(){
        if(dadosDoAtleta.calcularIMC() > 25){
            System.out.println(-1);
            System.out.println("O atleta nao pode ser titular");
            return status;
              
        }else{
            System.out.println(0);
            System.out.println("O agora é titular do time");
            return status = true;
            
        }
        
    }
    
    public void exibirDados(){
        System.out.println(getNome());
        System.out.println(getNumeroDaCamisa());
        System.out.println(getPosicao());
        System.out.println(isStatus());
        dadosDoAtleta.exibirParametros();
    }
   
    
    
    
    
}
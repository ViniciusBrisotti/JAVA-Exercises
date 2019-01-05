package Association;

public class DadosFisicos {
    
    //atributos
    private double peso;
    private double altura;
    private int idade;
    
    // gets e sets
    public double getPeso(){
        return this.peso;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    
    public double getAltura(){
        return this.altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    
    //metodos
    public double calcularIMC(){
        double imc = (peso/(altura*altura));
        
        if(imc <= 18.5){
            System.out.println("Jogador tem peso abaixo da normalidade");
        }
        if(imc > 18.5 && imc <= 25){
            System.out.println("Jogador tem peso dentro da normalidade");
        }
        if(imc > 25 && imc <= 30){
            System.out.println("Jogador tem peso acima da normalidade");
        }
        if(imc > 30){
            System.out.println("Jogador está obeso");
        }
        return imc;

    }
    
    
    public void exibirParametros(){
        System.out.println(getPeso());
        System.out.println(getAltura());
        System.out.println(getIdade());

                
    }
    
}

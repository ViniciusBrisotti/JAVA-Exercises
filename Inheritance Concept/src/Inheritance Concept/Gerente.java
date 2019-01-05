
package bytebankherdado;


public class Gerente extends Funcionario{
    private int password;

    public void setPassowrd(int password) {
        this.password = password;
    }
    
    public boolean autentification(int password){
        if(this.password == password){
            return true;  
        }
        else{
            return false;
        }
        
    }
    public double getBonificacao(){
        return super.getBonificacao() + super.getSalario();
    }
}


package bytebankherdado;

public class TesteReferencias {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Paulo");
        g1.setSalario(5000);
        
        EditorVideo ev = new EditorVideo();
        ev.setNome("João");
        ev.setSalario(2500);
        
        Designer d = new Designer();
        d.setNome("Pedro");
        d.setSalario(2000);
        
        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(ev);
        controle.registra(d);
        
        System.out.println(controle.getSoma());
        
   
    }
    
}

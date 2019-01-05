
package bytebankherdado;

public class TesteGerente {
    public static void main(String[] args) {
        Gerente manager1 = new Gerente();
        
        manager1.setNome("Vinicius Oliveira");
        manager1.setCpf("95987565456-55");
        manager1.setSalario(15000);
        manager1.setPassowrd(10010);
        
        
        boolean passwordSecurity = manager1.autentification(10010);
        
        System.out.println(manager1.getNome());
        System.out.println(manager1.getCpf());
        System.out.println(manager1.getSalario());
        System.out.println(passwordSecurity);
        System.out.println(manager1.getBonificacao());
        
        
    }
    
}
